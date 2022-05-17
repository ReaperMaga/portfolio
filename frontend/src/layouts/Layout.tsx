import {ReactNode} from "react";
import Sidebar from "../components/sidebar/Sidebar";

interface LayoutProps {
    children: ReactNode,
    className?: string
}

const Layout = ({children, className = ""}: LayoutProps) => {

    const classes = [
        "flex w-screen h-screen bg-zinc-800",
        className,
    ]

    return (
        <div className={classes.join(" ")}>
            <Sidebar />
            {children}
        </div>
    )
}

export default Layout
