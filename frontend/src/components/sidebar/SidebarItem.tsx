import {ReactNode, useState} from "react";
import Link from "next/link";
import {useRouter} from "next/router";

interface SidebarItemProps {
    name: string,
    url: string,
    icon: ReactNode
}

const SidebarItem = ({name, url, icon}: SidebarItemProps) => {

    const [showName, setShowName] = useState(false)

    const router = useRouter()

    const classes = "text-4xl transition cursor-pointer " + (router.pathname === url ? "text-sky-600" : "text-gray-500 hover:text-sky-600 hover:scale-95")

    return (
        <Link href={url} passHref={true}>
            <a onMouseEnter={() => setShowName(true)} onMouseLeave={() => setShowName(false)} className={classes}>
                {showName ?
                    <span className="text-sm uppercase">{name}</span>
                    :
                    icon
                }
            </a>
        </Link>
    )
}

export default SidebarItem
