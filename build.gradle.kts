import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformJvmPlugin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin(Plugins.JVM) version Versions.KOTLIN
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

allprojects {
    apply {
        plugin<JavaLibraryPlugin>()
        plugin<KotlinPlatformJvmPlugin>()
    }

    repositories {
        mavenCentral()
    }

    configurations {
        compileOnly {
            extendsFrom(configurations.annotationProcessor.get())
        }
    }
}

val kotlinProjects = listOf(
    projects.chessDomain,
    projects.chessApp,
).map { it.dependencyProject }

configure(kotlinProjects) {
    dependencies {
        testImplementation(kotlin("test"))
        testImplementation(Dependencies.Kotest.RUNNER_JUNIT5)
        testImplementation(Dependencies.Kotest.ASSERTIONS_CORE)
        testImplementation(Dependencies.Kotest.PROPERTY)
    }

    tasks {
        test {
            useJUnitPlatform()
        }

        withType<KotlinCompile> {
            kotlinOptions.jvmTarget = "17"
        }
    }
}
