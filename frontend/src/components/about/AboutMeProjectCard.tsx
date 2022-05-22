import Atropos from "atropos/react";
import {ReactNode, useState} from "react";
import {Transition} from "@headlessui/react";

interface AboutMeProjectCardProps {
    title: string,
    imageUrl: string,
    children?: ReactNode,
    url?: string
}

const AboutMeProjectCard = ({title, imageUrl, children, url}: AboutMeProjectCardProps) => {
    const [hovering, setHovering] = useState(false)

    return (
        <Atropos
            highlight={false}
            shadow={false}
            className="w-full h-64"
        >
            <div onMouseEnter={() => setHovering(true)} onMouseLeave={() => setHovering(false)}
                 className="w-full h-64 bg-center bg-cover rounded border-4 shadow cursor-pointer bg-zinc-700 border-zinc-700"
                 style={{backgroundImage: "url('" + imageUrl + "')"}}>
                <div className="w-full h-full bg-transparent transition hover:bg-zinc-600/75">
                    <a className="w-full h-full" href={url} target="_blank" rel="noreferrer">
                        <Transition
                            show={hovering}
                            enter="transform transition duration-500"
                            enterFrom="translate-y-full"
                            enterTo="translate-y-0"
                            as="div"
                            className="flex flex-col justify-center items-center space-y-2 w-full h-full"
                        >
                            <h1 className="text-3xl text-gray-300 uppercase font-code">{title}</h1>
                            <div className="flex justify-center w-full">
                                {children}
                            </div>
                        </Transition>
                    </a>

                </div>
            </div>
        </Atropos>

    )
}

export default AboutMeProjectCard
