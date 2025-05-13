package com.github.reapermaga.portfolio.components

import dev.fritz2.core.RenderContext


fun RenderContext.skills() {
    section("mt-20 flex flex-col gap-y-4") {
        div("flex flex-col mt-20 mb-5 gap-y-2") {
            h1("text-3xl font-bold text-gray-200") {
                +"Knowledge & Skills"
            }
            span("text-gray-400") {
                +"These are my skills and the knowledge I bring to the table"
            }
        }
        div("w-full flex flex-col gap-y-8") {
            skillsSection("Frontend") {
                skillsBadge("vscode-icons:file-type-nuxt", "NuxtJS")
                skillsBadge("logos:nextjs-icon", "NextJS")
                skillsBadge("devicon:tailwindcss", "Tailwind")
            }
            skillsSection("Backend") {
                skillsBadge("logos:quarkus-icon", "Quarkus")
                skillsBadge("logos:spring-icon", "Spring")
                skillsBadge("openmoji:golang", "Fiber")
            }
            skillsSection("DevOps") {
                skillsBadge("vscode-icons:file-type-git", "Git")
                skillsBadge("logos:docker-icon", "Docker")
                skillsBadge("devicon:podman", "Podman")
                skillsBadge("logos:github-actions", "Github Actions")
                skillsBadge("logos:drone-icon", "DroneCI")
                skillsSectionBreak()
                skillsBadge("logos:kubernetes", "Kubernetes")
                skillsBadge("logos:terraform-icon", "Terraform")
                skillsBadge("simple-icons:sonatype", "Sonatype Nexus")
            }
        }
    }
}

private fun RenderContext.skillsBadge(icon: String, name: String) {
    div("grow-0 bg-primary-600/50 transition hover:bg-primary-600/80 cursor-default flex items-center gap-x-2 px-3 py-2 rounded-sm shadow-sm") {
        icon(icon)
        +name
    }
}

private fun RenderContext.skillsSection(title: String, badges: RenderContext.() -> Unit) {
    div("w-full flex flex-col gap-y-3") {
        h3("text-xl font-bold text-gray-300") {
            +title
        }
        div("flex grow-0 gap-3 flex-wrap") {
            badges()
        }
    }
}

private fun RenderContext.skillsSectionBreak() = div("basis-full h-0") {  }