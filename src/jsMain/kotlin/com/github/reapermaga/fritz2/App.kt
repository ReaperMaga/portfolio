package com.github.reapermaga.fritz2

import com.github.reapermaga.fritz2.components.ButtonType
import com.github.reapermaga.fritz2.components.customButton
import com.github.reapermaga.fritz2.components.navbar
import com.github.reapermaga.fritz2.components.stars
import com.github.reapermaga.fritz2.utils.loremIpsum
import dev.fritz2.core.alt
import dev.fritz2.core.render
import dev.fritz2.core.src


fun main() {
    render {
        div("w-screen min-h-screen bg-[radial-gradient(169.40%_89.55%_at_94.76%_6.29%,#0F110C_0%,#0C0E0A_100%)] flex flex-col inter-500 text-gray-300") {
            navbar()
            stars()

            header("flex justify-between w-6/12 mx-auto mt-28 z-10") {
                div("w-1/2 flex justify-center flex-col") {
                    h1("text-4xl font-bold") {
                        +"Hello, my name is "
                        span("text-primary") {
                            +"Maga"
                        }
                    }
                    p("mt-4 text-gray-400 text-xl") {
                        +loremIpsum(27)
                    }
                    div("flex mt-6 gap-6") {
                        customButton("Read more...", ButtonType.PRIMARY)
                        customButton("View my projects", ButtonType.SECONDARY)
                    }
                }
                div("w-1/2 flex justify-end") {
                    img("w-72 h-auto rounded-xl transition border-2 border-background-200 hover:border-background-50 shadow-xl") {
                        src("https://avatars.githubusercontent.com/u/25954039?v=4")
                        alt("My profile")
                    }
                }

            }
        }
    }
}
