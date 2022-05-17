import {ReactNode} from "react";
import {Transition} from "@headlessui/react";

interface SwitchSceneAnimation {
    children: ReactNode
}

const SwitchSceneAnimation = ({children}: SwitchSceneAnimation) => {
    return (
        <Transition
            appear={true}
            show={true}
            enter="transform transition duration-500"
            enterFrom="-translate-y-96"
            enterTo="translate-y-0"
        >
            {children}
        </Transition>
    )
}

export default SwitchSceneAnimation
