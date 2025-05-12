package com.github.reapermaga.portfolio.components

import dev.fritz2.core.RenderContext

fun RenderContext.projects() {
    section("mt-20 flex flex-col gap-y-4") {
        div("flex flex-col mt-20 mb-5 gap-y-2") {
            h1("text-3xl font-bold text-gray-200") {
                +"My projects"
            }
            span("text-gray-400") {
                +"A glimpse into the things I’ve built, explored, and created"
            }
        }
        div("w-full grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4 justify-center") {
            projectCard(
                "Pixeltranslate",
                "https://pixeltranslate.com",
                "images/pixeltranslate.png",
                "Translation service specialized in game development"
            )
            projectCard(
                "Rechnungsradar",
                "https://rechnungsradar.com",
                "images/rechnungsradar.png",
                "Tool to manage your invoices and payments"
            )
            projectCard(
                "Ameliorated",
                "https://ameliorated.info",
                "images/ameliorated.png",
                "Windows performance enhancement wizard. I have worked on the website."
            )
        }
    }

}