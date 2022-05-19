import {observer} from "mobx-react-lite";
import Layout from "../layouts/Layout";
import SwitchSceneAnimation from "../components/animation/SwitchSceneAnimation";
import TypeAnimation from "react-type-animation"
import OutlineButton from "../components/buttons/OutlineButton";
import ScaleInAnimation from "../components/animation/ScaleInAnimation";

import Lottie from 'react-lottie';
import * as animation from '../../public/animations/home-animation.json'

const IndexPage = observer(() => {

    return (
        <Layout>
            <ScaleInAnimation>
                <div className="flex items-center justify-center xl:justify-start w-full h-full px-0 xl:px-56">
                    <div className="flex flex-col items-start w-1/2">
                        <TypeAnimation
                            cursor={true}
                            sequence={["Welcome, my name is Maga", 6000]}
                            wrapper="h2"
                            className="text-4xl text-zinc-300 font-code text-sky-300"
                        />
                        <h1 className="text-lg text-gray-500 font-code">Fullstack Developer / Freelancer</h1>
                        <div className="mt-12">
                            <OutlineButton>CONTACT ME</OutlineButton>
                        </div>
                    </div>

                    <div className="justify-start hidden xl:flex w-1/2 z-30">
                        <Lottie options={{
                            loop: true,
                            autoplay: true,
                            animationData: animation,
                        }}  height={400} width={400} isStopped={false} isPaused={false} />
                    </div>
                </div>
            </ScaleInAnimation>
        </Layout>
    )
})

export default IndexPage
