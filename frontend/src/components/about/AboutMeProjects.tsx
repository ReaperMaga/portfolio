
import TypeAnimation from "react-type-animation"

const AboutMeProjects = () => {
    return (
        <div className="flex flex-col items-start w-full 2xl:w-1/2 justify-center space-y-10">
            <TypeAnimation
                cursor={true}
                sequence={["My projects", 6000]}
                wrapper="h2"
                className="text-4xl uppercase text-zinc-300 font-code text-sky-300"
            />
            <div className="grid grid-cols-3 w-full gap-4">
               <Project />
               <Project />
               <Project />
            </div>

        </div>
    )
}

const Project = () => {
    return (
        <div className="bg-zinc-700 w-full h-64 rounded shadow">

        </div>
    )
}

export default AboutMeProjects
