plugins {
    kotlin("jvm").version("1.3.72")
}
repositories {
    mavenCentral()
}
dependencies {
    api(kotlin("stdlib-jdk8"))
    testImplementation("junit:junit:4.12")
}
