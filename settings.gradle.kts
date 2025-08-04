pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap") }
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlin-native/maven") }
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlinx/kotlinx") }
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/icerockdev/plugins") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        // Kotlin MPP & Native destekleri:
        maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap") }
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlin/native-dev") }
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlin-native/maven") }
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlinx/kotlinx") }
    }
}
