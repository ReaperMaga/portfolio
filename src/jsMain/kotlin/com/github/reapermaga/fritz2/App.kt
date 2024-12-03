package com.github.reapermaga.fritz2

import com.github.reapermaga.fritz2.components.*
import com.github.reapermaga.fritz2.utils.loremIpsum
import dev.fritz2.core.RenderContext
import dev.fritz2.core.href
import dev.fritz2.core.render
import dev.fritz2.core.src


fun main() {
    render {
        div("w-screen min-h-screen bg-[radial-gradient(169.40%_89.55%_at_94.76%_6.29%,#0F110C_0%,#0C0E0A_100%)] flex flex-col inter-500 text-gray-300") {
            stars()
            div("w-8/12 mx-auto z-10") {
                navbar()
                header()
                div("mt-20 w-full grid grid-cols-3 gap-4 justify-center px-10") {
                    card()
                    card()
                    card()
                }
            }

        }
    }
}

fun RenderContext.card() {
    div("flex flex-col justify-between overflow-hidden w-full h-72 glass bg-background-400/60 border border-background-200 hover:-translate-y-1 transition") {
        div("w-full flex justify-between px-5 py-6") {
            div("flex flex-col gap-3") {
                h2("text-xl font-bold") {
                    +"Pixeltranslate"
                }
                p("text-md text-gray-400") {
                    +loremIpsum(9)
                }
            }
            a {
                href("https://pixeltranslate.com")
                icon("ph:arrow-square-out-bold", "text-2xl text-gray-400 hover:text-gray-300 transition")
            }
        }
        div("w-full h-full mt-3 px-5") {
            img("rounded-t-lg shadow-lg") {
                src("images/pixeltranslate.png")
            }
        }

    }
}
