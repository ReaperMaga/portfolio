package com.github.reapermaga.portfolio

import com.github.reapermaga.portfolio.components.*
import dev.fritz2.core.RenderContext
import dev.fritz2.core.id
import dev.fritz2.core.render


fun main() {
    render {
        div("relative w-screen min-h-screen bg-[radial-gradient(169.40%_89.55%_at_94.76%_6.29%,#0F110C_0%,#0C0E0A_100%)] flex flex-col space-mono-regular text-gray-300") {
            stars()
            gridPattern()
            div("w-full md:w-11/12 2xl:w-8/12 mx-auto z-10 px-10") {
                linkMarker("home")
                navbar()
                header()
                linkMarker("projects")
                projects()
            }
            footer()
        }
    }
}

fun RenderContext.linkMarker(url : String) {
    div {
        id(url)
    }
}

