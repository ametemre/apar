plugins {
    kotlin("multiplatform")
    id("com.android.library")
    alias(libs.plugins.moko.resources)
    kotlin("plugin.serialization") version libs.versions.kotlin.get()
}

kotlin {
    androidTarget()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.moko.resources)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
                implementation("io.ktor:ktor-client-core:2.3.3")
                implementation("io.ktor:ktor-client-json:2.3.3")
                implementation("io.ktor:ktor-client-serialization:2.3.3")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-okhttp:2.3.3")
            }
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting

        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }

    sourceSets.all {
        languageSettings.optIn("dev.icerock.moko.resources.MRExperimental")
    }
}

android {
    namespace = "com.kurmes.apar.shared"
    compileSdk = 35
    defaultConfig {
        minSdk = 25
    }
}
