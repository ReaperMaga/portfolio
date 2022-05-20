import {useRef} from "react";
import Layout from "../../layouts/Layout";
import ScaleInAnimation from "../animation/ScaleInAnimation";
import {Splide, SplideSlide} from "@splidejs/react-splide";
import AboutMeText from "./AboutMeText";
import {AiOutlineArrowDown, AiOutlineArrowUp} from "react-icons/ai";
import AboutMeProjects from "./AboutMeProjects";

const AboutMe = () => {
    const splide = useRef(null)

    return (
        <Layout>
            <ScaleInAnimation>
                <div className="flex overflow-hidden flex-col justify-center items-center xl:items-start px-0 xl:px-56 w-full h-full">
                    <Splide ref={splide} aria-label="Projects" options={{
                        wheel: true,
                        pagination: false,
                        arrows: false,
                        height: "100%",
                        direction: "ttb"
                    }}>
                        <SplideSlide>
                            <AboutMeContent onClick={() => {
                                splide.current.splide.go(1)
                            }}/>
                        </SplideSlide>
                        <SplideSlide>
                            <ProjectsContent onClick={() => {
                                splide.current.splide.go(-1)
                            }}/>
                        </SplideSlide>
                    </Splide>
                </div>
            </ScaleInAnimation>
        </Layout>
    )
}

const AboutMeContent = ({onClick}) => {
    return (
        <div className="flex flex-col justify-center px-2 w-full h-full">
            <AboutMeText/>
            <div className="flex justify-center items-start pt-12 md:pt-28 w-full">
                <a onClick={onClick}
                   className="flex flex-col items-center transition animate-pulse hover:scale-95 cursor-pointer">
                        <span className="text-lg text-gray-400 font-code">
                            Projects
                        </span>
                    <span className="text-lg text-gray-300">
                            <AiOutlineArrowDown/>
                        </span>
                </a>
            </div>
        </div>
    )
}

const ProjectsContent = ({onClick}) => {
    return (
        <div className="flex flex-col justify-center px-2 w-full h-full">
            <div className="flex justify-center items-end pb-12 md:pb-28 w-full">
                <a onClick={onClick}
                   className="flex flex-col items-center mt-5 space-y-2 transition animate-pulse hover:scale-95 cursor-pointer">
                    <span className="text-lg text-gray-300">
                            <AiOutlineArrowUp/>
                        </span>
                    <span className="text-lg text-gray-400 font-code">
                            About me
                        </span>
                </a>
            </div>
            <AboutMeProjects/>
        </div>
    )
}

export default AboutMe
