pluginManagement {
   includeBuild("build-logic")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

dependencyResolutionManagement {
   repositories {
      mavenCentral()
   }
}

rootProject.name = "example"
include("app", "core", "model")
for (project in rootProject.children) {
   project.projectDir = file("modules/${project.name}")
}
