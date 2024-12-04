package com.github.reapermaga.portfolio.components

import dev.fritz2.core.RenderContext
import dev.fritz2.core.href

fun RenderContext.navbar() {
    nav("flex w-full h-20 mx-auto items-center justify-between shadow-xl px-4 lg:px-12 bg-background-400 rounded-b") {
        logo()
        ul("flex gap-6 items-center") {
            navbarLink("Home")
            navbarLink("Projects")
            customButton("Contact me", ButtonType.PRIMARY, classes = "hidden sm:flex")
        }
    }
}

fun RenderContext.navbarLink(text: String, url: String = "#") {
    li {
        a("text-lg text-gray-400 hover:text-gray-300 transition leading-4") {
            href(url)
            +text
        }
    }
}

