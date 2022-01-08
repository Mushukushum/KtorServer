plugins {
    application
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.serialization") version "1.5.31"
}

group = "org.example"
version = "1.0-SNAPSHOT"

application{
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("io.ktor:ktor-server-core:1.6.7")
    implementation("io.ktor:ktor-server-netty:1.6.7")
    implementation("ch.qos.logback:logback-classic:1.2.10")
    implementation("io.ktor:ktor-serialization:1.6.4")

    implementation ("io.insert-koin:koin-ktor:3.1.4")
    implementation ("io.insert-koin:koin-logger-slf4j:3.1.4")

}