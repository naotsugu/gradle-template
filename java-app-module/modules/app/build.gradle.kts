plugins {
    id("com.example.application")
}

dependencies {
    implementation(project(":model"))
}

application {
    mainClass.set("com.example.app.App")
}
