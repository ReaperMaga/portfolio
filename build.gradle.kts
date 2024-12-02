import com.google.devtools.ksp.gradle.KspTaskMetadata
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.google.ksp)
    alias(libs.plugins.kotlin.serialization)
}

repositories {
    mavenCentral()
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/") // new repository here
}

//group = "my.fritz2.app"
//version = "0.0.1-SNAPSHOT"

kotlin {
    jvm()
    js(IR) {
        browser()
    }.binaries.executable()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.fritz2.core)
                implementation(libs.fritz2.serialization)
                // implementation(libs.fritz2.headless) // optional
            }
        }
        val jvmMain by getting {
            tasks.withType<Jar> {
                manifest {
                    attributes["Main-Class"] = "com.github.reapermaga.fritz2.MainKt"
                }
            }
            dependencies {

            }
        }
        val jsMain by getting {
            dependencies {
                // tailwind
                implementation(npm(libs.tailwindcss.core))
                implementation(npm(libs.tailwindcss.typography))
                //implementation(npm(libs.tailwindcss.forms)) // optional

                // webpack
                implementation(npm(libs.postcss.core))
                implementation(npm(libs.postcss.loader))
                implementation(npm(libs.autoprefixer))
                implementation(npm(libs.css.loader))
                implementation(npm(libs.style.loader))
                implementation(npm(libs.cssnano))
            }
        }
    }
}

rootProject.plugins.withType<YarnPlugin> {
    rootProject.the<YarnRootExtension>().lockFileDirectory = project.rootDir.resolve("/")
}


// KSP support for Lens generation
dependencies.kspCommonMainMetadata(libs.fritz2.lenses)
kotlin.sourceSets.commonMain { tasks.withType<KspTaskMetadata> { kotlin.srcDir(destinationDirectory) } }

// FIXME: Simple workaround to make version catalogs usable for npm dependencies too. Remove if kotlin plugin
//  supports this out of the box!
fun KotlinDependencyHandler.npm(dependency: Provider<MinimalExternalModuleDependency>): Dependency =
    dependency.map { dep ->
        val name = if (dep.group == "npm") dep.name else "@${dep.group}/${dep.name}"
        npm(name, dep.version!!)
    }.get()
