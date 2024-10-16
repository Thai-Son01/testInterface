plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.Thai-Son01"
            artifactId = "manga-extension-interface"
            version = "1.0"

            from(components["java"])
        }
    }
}