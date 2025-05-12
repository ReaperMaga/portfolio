package com.github.reapermaga.portfolio.components

import dev.fritz2.core.RenderContext
import dev.fritz2.core.href
import dev.fritz2.core.target

fun RenderContext.footer() {
    footer("mt-28 h-16 flex items-center bg-background-400 z-20") {
        div("w-8/12 mx-auto px-10 flex justify-between items-center") {
            h3("text-sm") {
                +"ReaperMaga - Full Stack Developer"
            }
            div("flex gap-x-5") {
                footerLink("Github", "https://github.com/reapermaga")
                footerLink("Twitter", "https://twitter.com/reaper_maga")
            }
        }
    }
}

private fun RenderContext.footerLink(text : String, url : String = "#") {
    a("cursor-pointer text-sm hover:text-gray-400") {
        href(url)
        target("_blank")
        +text
    }
}