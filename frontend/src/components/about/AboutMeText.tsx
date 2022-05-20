import {AiOutlineGithub, AiOutlineTwitter} from "react-icons/ai";

import TypeAnimation from "react-type-animation"
import OutlineButton from "../buttons/OutlineButton";

const AboutMeText = () => {
    return (
        <div className="flex flex-col justify-center items-start space-y-10 w-full 2xl:w-1/2">
            <TypeAnimation
                cursor={true}
                sequence={["About me", 6000]}
                wrapper="h2"
                className="text-4xl uppercase text-zinc-300 font-code text-sky-300"
            />
            <div className="flex relative w-full">
                <div className="absolute w-px h-full bg-sky-600"></div>
                <p className="pl-5 md:text-xl text-gray-400 text-md">
                    My name is Maga A., I was born in Russia, but moved to Austria when I was 2 years old.

                    I attended a private school and graduated with a normal result.
                    I taught myself programming by developing projects that I could use myself. I never went into it with the intention of really making money with my programming skills and saw it more as a hobby. After some time my skills developed and I started doing contract programming.

                    I trained myself in backend development, frontend development, game development and mobile app development.
                </p>
            </div>

            <div className="flex space-x-5">
                <a href="https://github.com/reapermaga">
                    <OutlineButton><AiOutlineGithub /></OutlineButton>
                </a>

                <a href="https://twitter.com/reaper_maga">
                    <OutlineButton><AiOutlineTwitter /></OutlineButton>
                </a>
            </div>
        </div>
    )
}

export default AboutMeText
