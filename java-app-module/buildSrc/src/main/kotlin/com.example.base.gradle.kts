plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    constraints {
        // Define dependency versions as constraints
        // implementation("org.apache.commons:commons-lang3:3.12.0")
        testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    }
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
    }
}

tasks.withType<JavaCompile> {
    options.encoding = Charsets.UTF_8.name()
}