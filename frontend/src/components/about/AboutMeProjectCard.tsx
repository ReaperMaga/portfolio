import Atropos from "atropos/react";
import {ReactNode, useState} from "react";
import {Transition} from "@headlessui/react";
import {useRouter} from "next/router";

interface AboutMeProjectCardProps {
    title: string,
    imageUrl: string,
    children?: ReactNode,
    url?: string
}

const AboutMeProjectCard = ({title, imageUrl, children, url}: AboutMeProjectCardProps) => {

    const router = useRouter()

    const [hovering, setHovering] = useState(false)

    return (
        <Atropos
            highlight={false}
            shadow={false}
            className="w-full h-64"
        >
            <div onClick={() => {
                if(url) {
                    router.push(url)
                }
            }} onMouseEnter={() => setHovering(true)} onMouseLeave={() => setHovering(false)}  className="cursor-pointer w-full h-64 rounded shadow bg-zinc-700 bg-cover bg-center border-4 border-zinc-700"
                 style={{backgroundImage: "url('"+imageUrl+"')"}}>
                <div className="w-full h-full bg-transparent transition hover:bg-zinc-600/75">
                    <Transition
                        show={hovering}
                        enter="transform transition duration-500"
                        enterFrom="translate-y-full"
                        enterTo="translate-y-0"
                        as="div"
                        className="flex flex-col justify-center items-center w-full h-full space-y-2"
                    >
                        <h1 className="text-3xl text-gray-300 uppercase font-code">{title}</h1>
                        <div className="flex justify-center w-full">
                            {children}
                        </div>
                    </Transition>
                </div>
            </div>
        </Atropos>

    )
}

export default AboutMeProjectCard
