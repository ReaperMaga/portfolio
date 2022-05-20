import {observer} from "mobx-react-lite";
import Layout from "../layouts/Layout";
import ScaleInAnimation from "../components/animation/ScaleInAnimation";

import Lottie from 'react-lottie';
import * as animation from '../../public/animations/404.json'


const Page = observer(() => {

    return (
        <Layout>
            <ScaleInAnimation>
                <div className="flex flex-col justify-center items-center w-full h-full">
                    <h1 className="text-4xl text-red-500 uppercase font-code mb-10">404 page not found</h1>
                    <Lottie options={{
                        loop: true,
                        autoplay: true,
                        animationData: animation,
                    }}  height={200} width={200} isStopped={false} isPaused={false} />
                </div>
            </ScaleInAnimation>
        </Layout>
    )
})

export default Page
