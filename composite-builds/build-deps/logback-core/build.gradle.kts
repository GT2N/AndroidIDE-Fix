plugins {
    id("java-library")
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    api("ch.qos.logback:logback-core:1.4.14")
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.0.0")
}
