plugins {
    application
    id("org.openjfx.javafxplugin") version "0.0.14"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
    }
}

application {
    mainClass.set("com.example.App")
    mainModule.set("com.example")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

javafx {
    version = "20"
    modules("javafx.controls")
}
