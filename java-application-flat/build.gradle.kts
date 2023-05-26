plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")

    // This dependency is used by the application.
    // implementation("org.apache.commons:commons-lang3:3.12.0")
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

