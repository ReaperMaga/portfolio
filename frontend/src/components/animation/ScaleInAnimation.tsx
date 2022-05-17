import {ReactNode} from "react";
import {Transition} from "@headlessui/react";

interface ScaleInAnimationProps {
    children: ReactNode
}

const ScaleInAnimation = ({children}: ScaleInAnimationProps) => {
    return (
        <Transition
            appear={true}
            show={true}
            enter="transform transition duration-500"
            enterFrom="scale-0"
            enterTo="scale-100"
            className="w-full h-full"
        >
            {children}
        </Transition>
    )
}

export default ScaleInAnimation
