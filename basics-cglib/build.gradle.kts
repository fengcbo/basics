plugins {
    java
}

dependencies {
    testImplementation("junit", "junit", "4.12")
    implementation("cglib", "cglib", "3.3.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}