package com.github.reapermaga.fritz2

import com.github.reapermaga.fritz2.components.*
import dev.fritz2.core.render


fun main() {
    render {
        div("w-screen min-h-screen bg-[radial-gradient(169.40%_89.55%_at_94.76%_6.29%,#0F110C_0%,#0C0E0A_100%)] flex flex-col inter-500 text-gray-300") {
            navbar()
            stars()
            header("flex justify-between w-7/12 mx-auto mt-28 z-10 px-10") {
                div("w-1/2 flex justify-center flex-col") {
                    h1("text-4xl font-bold") {
                        +"Hello, my name is "
                        span("text-primary") {
                            +"Maga"
                        }
                    }
                    p("mt-4 text-gray-400 text-xl") {
                        +"I'm a full-stack developer specializing in backend magic, but I can handle frontend too. I build scalable systems, craft seamless APIs, and create smooth user experiences across the stack!"
                    }
                    div("flex mt-6 gap-6") {
                        customButton("Read more...", ButtonType.PRIMARY)
                        customButton("View my projects", ButtonType.SECONDARY)
                    }
                }
                div("flex flex-col items-end") {
                    profileImage()
                    div("w-full flex gap-4 justify-center mt-3") {
                        socialIcon(
                            "ph:github-logo-fill",
                            iconClasses = "text-xl bg-slate-600 p-2 rounded-full opacity-80 hover:opacity-100",
                            href = "https://github.com/reapermaga")
                        socialIcon(
                            "ph:twitter-logo-fill",
                            iconClasses = "text-xl bg-blue-500 p-2 rounded-full opacity-80 hover:opacity-100",
                            href = "https://twitter.com/reaper_maga")
                    }
                }

            }
        }
    }
}
