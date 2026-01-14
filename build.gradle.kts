plugins {
    `java-library`
    `maven-publish`
    `signing`
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "com.zits"
version = "9.1.0"

repositories {
    mavenCentral()
}

javafx {
    version = "21"
    modules("javafx.controls", "javafx.fxml")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.testfx:testfx-junit5:4.0.16-alpha")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = "modern-switch"
            from(components["java"])
            pom {
                name.set("Modern Switch")
                description.set("Componente JavaFX")
                url.set("https://github.com/TU_USUARIO/modern-switch-library")
                licenses {
                    license {
                        name.set("Apache 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("tu_id")
                        name.set("Raul Gil")
                        email.set("raulgilnavarro@email.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/zetaits/modern-switch-library.git")
                    url.set("https://github.com/zetaits/modern-switch-library")
                }
            }
        }
    }
}