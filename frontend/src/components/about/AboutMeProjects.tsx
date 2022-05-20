
import TypeAnimation from "react-type-animation"
import AboutMeProjectCard from "./AboutMeProjectCard";

const AboutMeProjects = () => {
    return (
        <div className="flex flex-col justify-center items-start space-y-10 w-full 2xl:w-11/12">
            <TypeAnimation
                cursor={true}
                sequence={["My projects", 6000]}
                wrapper="h2"
                className="text-4xl uppercase text-zinc-300 font-code text-sky-300"
            />
            <div className="grid grid-cols-1 md:grid-cols-2 xl:grid-cols-3 gap-4 px-2 w-full">
                <AboutMeProjectCard title="MyAnimeApp" imageUrl="projects/myanimeapp.jpeg" url="https://imgur.com/a/1yy39n6">
                    <div className="py-px px-2 text-gray-300 bg-red-500 rounded-md text-md">Website</div>
                </AboutMeProjectCard>
                <AboutMeProjectCard title="Frostbite" imageUrl="projects/frostbite.jpeg" url="https://youtu.be/FiOE4P8z-gc">
                    <div className="py-px px-2 text-gray-300 rounded-md bg-sky-500 text-md">Game</div>
                </AboutMeProjectCard>

                <AboutMeProjectCard title="Pixel Stack" imageUrl="projects/pixelstack.png" url="https://play.google.com/store/apps/details?id=com.PrismarinStudio.PixelStack">
                    <div className="py-px px-2 text-gray-300 rounded-md bg-sky-500 text-md">Game</div>
                </AboutMeProjectCard>

            </div>

        </div>
    )
}



export default AboutMeProjects
