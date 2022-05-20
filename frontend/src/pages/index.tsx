import {observer} from "mobx-react-lite";
import Layout from "../layouts/Layout";
import TypeAnimation from "react-type-animation"
import OutlineButton from "../components/buttons/OutlineButton";
import ScaleInAnimation from "../components/animation/ScaleInAnimation";

import Lottie from 'react-lottie';
import * as animation from '../../public/animations/home-animation.json'
import Link from "next/link";

const IndexPage = observer(() => {
    return (
        <Layout>
            <ScaleInAnimation>
                <div className="flex justify-center xl:justify-start items-center px-0 xl:px-56 w-full h-full">
                    <div className="flex flex-col items-start w-1/2">
                        <TypeAnimation
                            cursor={true}
                            sequence={["Welcome, my name is Maga", 6000]}
                            wrapper="h2"
                            className="text-4xl text-zinc-300 font-code text-sky-300"
                        />
                        <h1 className="text-lg text-gray-500 font-code">Fullstack Developer / Freelancer</h1>
                        <div className="mt-12">
                            <Link href="/contact" passHref={true}>
                                <OutlineButton>CONTACT ME</OutlineButton>
                            </Link>
                        </div>
                    </div>

                    <div className="hidden xl:flex z-30 justify-start w-1/2">
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
