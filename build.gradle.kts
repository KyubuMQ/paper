plugins {
    id("java")
    id("xyz.jpenilla.run-paper") version "2.2.0"
}

group = "com.kyubumq"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.2-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.runServer {
    minecraftVersion("1.20.2")
}