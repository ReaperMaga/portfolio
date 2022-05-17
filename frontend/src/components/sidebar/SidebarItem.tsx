import {ReactNode} from "react";
import Link from "next/link";
import {useRouter} from "next/router";

interface SidebarItemProps {
    url: string,
    icon: ReactNode
}

const SidebarItem = ({url, icon}: SidebarItemProps) => {

    const router = useRouter()

    const classes = "text-4xl transition cursor-pointer " + (router.pathname === url ? "text-sky-600" : "text-gray-500 hover:text-sky-600")

    return (
        <Link href={url} passHref={true}>
            <a className={classes}> {icon} </a>
        </Link>
    )
}

export default SidebarItem
