plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
}

java {
    toolchain {
        // Gradle 8.1 is not support java 20
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
