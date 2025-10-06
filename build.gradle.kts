plugins {
    kotlin("jvm") apply false
}

group = "ru.edu.ktln"
version = "1.0.1"

repositories {
    mavenCentral()
}

subprojects {
    repositories {
        mavenCentral()
    }
    group = rootProject.group
    version = rootProject.version
}