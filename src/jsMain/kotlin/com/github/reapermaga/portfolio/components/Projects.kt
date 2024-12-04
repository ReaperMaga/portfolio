package com.github.reapermaga.portfolio.components

import dev.fritz2.core.RenderContext

fun RenderContext.projects() {
    div("mt-20 w-full grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4 justify-center") {
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