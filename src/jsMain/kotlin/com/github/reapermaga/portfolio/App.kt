package com.github.reapermaga.portfolio

import com.github.reapermaga.portfolio.components.*
import dev.fritz2.core.render


fun main() {
    render {
        initializeScreen()
        div("relative w-screen min-h-screen bg-[radial-gradient(169.40%_89.55%_at_94.76%_6.29%,#0F110C_0%,#0C0E0A_100%)] flex flex-col inter-500 text-gray-300") {
            stars()
            gridPattern()
            div("w-full md:w-11/12 2xl:w-8/12 mx-auto z-10 px-2 lg:px-10") {
                navbar()
                header()
                projects()
                contactMe()
            }
            footer()
        }
    }
}

