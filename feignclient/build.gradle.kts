/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api(libs.org.springframework.boot.spring.boot.starter.data.jpa)
    api(libs.org.springframework.boot.spring.boot.starter.validation)
    api(libs.org.springframework.boot.spring.boot.starter.web)
    api(libs.org.springframework.cloud.spring.cloud.starter.openfeign)
    api(libs.org.projectlombok.lombok)
    api(libs.org.springdoc.springdoc.openapi.starter.webmvc.ui)
    api(libs.com.fasterxml.jackson.core.jackson.databind)
    runtimeOnly(libs.com.mysql.mysql.connector.j)
    testImplementation(libs.org.springframework.boot.spring.boot.starter.test)
}

group = "com.xworkz"
version = "0.0.1-SNAPSHOT"
description = "feignclient"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
