plugins {
    java
}

group = "com.fengcbo"
version = "1.0.0"

dependencies {
    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.compileJava.configure {
    options.encoding = "UTF-8"
}

tasks.compileTestJava.configure {
    options.encoding = "UTF-8"
}