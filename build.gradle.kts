plugins {
    id("java")
}

group = "com.craftinginterpreters"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.craftinginterpreters.lox.Lox" // Replace with your actual main class
    }
}