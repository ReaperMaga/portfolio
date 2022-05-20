import {observer} from "mobx-react-lite";
import Layout from "../layouts/Layout";
import TypeAnimation from "react-type-animation"
import OutlineButton from "../components/buttons/OutlineButton";
import ScaleInAnimation from "../components/animation/ScaleInAnimation";
import BottomLineInput from "../components/inputs/BottomLineInput";

import Lottie from 'react-lottie';
import * as animation from '../../public/animations/contact.json'
import {AiOutlineMail, AiOutlineProfile} from "react-icons/ai";
import {useState} from "react";

import emailjs from "@emailjs/browser"
import {useRouter} from "next/router";
import {ImSpinner} from "react-icons/im";

const Page = observer(() => {

    const router = useRouter()

    const [loading, setLoading] = useState(false)
    const [name, setName] = useState("")
    const [email, setEmail] = useState("")
    const [message, setMessage] = useState("")

    const [response, setResponse] = useState("")
    const [successResponse, setSuccessResponse] = useState("")

    const submit = () => {
        if(name && email && message && !loading) {
            if(!isValidEmail(email)) {
                setResponse("Wrong email format")
                return;
            }
            const serviceId = process.env.NEXT_PUBLIC_EMAIL_SERVICE_ID;
            const templateId = process.env.NEXT_PUBLIC_EMAIL_TEMPLATE_ID;
            const userId = process.env.NEXT_PUBLIC_EMAIL_USER_ID;
            const templateParams = {
                name,
                email,
                message
            }
            setLoading(true)
            emailjs.send(serviceId, templateId, templateParams, userId).then((response) => {
                setResponse("")
                setSuccessResponse("Successfully sent")
                setLoading(false)
                setTimeout(() => {
                    router.reload()
                }, 700)
            }).then((error) => {
                setResponse("There was an error while trying to send a email")
            })
        } else {
            setResponse("Please fill in all fields")
        }
    }

    const isValidEmail = email => {
        const regex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return regex.test(String(email).toLowerCase());
    };

    return (
        <Layout>
            <ScaleInAnimation>
                <div className="flex justify-center xl:justify-start items-center px-0 xl:px-56 w-full h-full">
                    <div className="flex flex-col justify-center items-center 2xl:items-start space-y-14 w-full 2xl:w-1/2">
                        <TypeAnimation
                            cursor={true}
                            sequence={["Contact me", 6000]}
                            wrapper="h2"
                            className="text-4xl uppercase text-zinc-300 font-code text-sky-300"
                        />
                        <div className="flex relative flex-col space-y-6 w-full">
                            <BottomLineInput onChange={event => setName(event.target.value)} type="text" placeholder="Name" icon={<AiOutlineProfile/>} required/>
                            <BottomLineInput onChange={event => setEmail(event.target.value)} type="text" placeholder="Email" icon={<AiOutlineMail/>} required/>


                            <div className="flex flex-col pt-5 space-y-2 w-10/12">
                                <div className="w-full h-px bg-sky-500"></div>
                                    <textarea onChange={event => setMessage(event.target.value)} required placeholder="Message" rows={4} maxLength={500}
                                              className="w-full text-gray-400 bg-transparent border-transparent focus:border-transparent focus:ring-0 shadow-sm resize-none"
                                    />
                                <div className="w-full h-px bg-sky-500"></div>
                            </div>
                        </div>
                        {successResponse !== "" ?
                            <p className="text-lg text-green-500">{successResponse}</p>
                            :
                            <p className="text-lg text-red-500">{response}</p>
                        }
                        
                        <div className="flex flex-col space-x-5">
                            <OutlineButton onClick={() => {submit()}} className="flex justify-center items-center space-x-3">
                                {loading &&
                                    <span className="text-lg text-gray-400 animate-spin"><ImSpinner /></span>
                                }
                                <span className="pt-1">SEND</span>
                            </OutlineButton>
                        </div>
                    </div>
                    <div className="hidden xl:flex z-30 justify-start w-1/2">
                        <Lottie options={{
                            loop: true,
                            autoplay: true,
                            animationData: animation,
                        }} height={400} width={400} isStopped={false} isPaused={false}/>
                    </div>
                </div>
            </ScaleInAnimation>
        </Layout>
    )
})

export default Page
