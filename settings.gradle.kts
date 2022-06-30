rootProject.name = "clean-architecture-chess"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    ":chess-domain",
    ":chess-app",
)
