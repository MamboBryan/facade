plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin{
    plugins {
        create("BuildManager"){
            id = "me.justmambo.plugin"
            implementationClass = "BuildManager"
            version = "0.0.1"
        }
    }
}