package com.github.reapermaga.fritz2.components

import com.github.reapermaga.fritz2.utils.loremIpsum
import dev.fritz2.core.RenderContext
import dev.fritz2.core.href
import dev.fritz2.core.src
import dev.fritz2.core.target

fun RenderContext.projectCard(title: String, url: String, image: String, description: String) {
    div("flex flex-col justify-between overflow-hidden w-full h-72 glass bg-background-400/60 border border-background-200 hover:border-background-50 hover:-translate-y-1 transition") {
        div("w-full flex justify-between px-5 py-6") {
            div("flex flex-col gap-3") {
                h2("text-xl font-bold") {
                    +title
                }
                p("text-md text-gray-400") {
                    +description
                }
            }
            a {
                href(url)
                target("_blank")
                icon("ph:arrow-square-out-bold", "text-2xl text-gray-400 hover:text-gray-300 transition")
            }
        }
        div("w-full h-full mt-3 px-5") {
            img("rounded-t-lg shadow-lg") {
                src(image)
            }
        }

    }
}
