plugins {
    kotlin("jvm").version("1.3.72")
}
repositories {
    mavenCentral()
}
dependencies {
    api(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}
tasks.named<Test>("test") {
    useJUnitPlatform()
}
