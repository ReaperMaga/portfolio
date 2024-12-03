package com.github.reapermaga.fritz2

import com.github.reapermaga.fritz2.components.header
import com.github.reapermaga.fritz2.components.navbar
import com.github.reapermaga.fritz2.components.projectCard
import com.github.reapermaga.fritz2.components.stars
import dev.fritz2.core.render


fun main() {
    render {
        div("w-screen min-h-screen bg-[radial-gradient(169.40%_89.55%_at_94.76%_6.29%,#0F110C_0%,#0C0E0A_100%)] flex flex-col inter-500 text-gray-300") {
            stars()
            div("w-8/12 mx-auto z-10") {
                navbar()
                header()
                div("mt-20 w-full grid grid-cols-3 gap-4 justify-center px-10") {
                    projectCard("Pixeltranslate",
                        "https://pixeltranslate.com",
                        "images/pixeltranslate.png",
                        "Translation service specialized in game development")
                    projectCard("Rechnungsradar",
                        "https://rechnungsradar.com",
                        "images/rechnungsradar.png",
                        "Tool to manage your invoices and payments"
                        )
                    projectCard("Ameliorated",
                        "https://ameliorated.info",
                        "images/ameliorated.png",
                        "Windows performance enhancement wizard"
                    )
                }
            }

        }
    }
}

