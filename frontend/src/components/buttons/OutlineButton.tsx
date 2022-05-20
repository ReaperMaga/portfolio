import {ButtonHTMLAttributes, DetailedHTMLProps, ReactNode} from "react";

interface OutlineButtonProps extends DetailedHTMLProps<ButtonHTMLAttributes<HTMLButtonElement>, HTMLButtonElement>{
    children: ReactNode
    className?: string,
}

const OutlineButton = ({children, className = "", ...HTMLAttributes}: OutlineButtonProps) => {

    const classes = [
        "border border-sky-600 text-gray-400 px-4 py-2 transition hover:bg-sky-700 rounded-sm font-code",
        className,
    ]

    return (
        <button className={classes.join(" ")} {...HTMLAttributes}>{children}</button>
    )
}

export default OutlineButton

