@file:Suppress("SpellCheckingInspection")

group = "cl.uchile.dcc.scrabble"
version = "0.1-ALPHA.1"


val jbAnnotationsVersion: String by project
val junitVersion: String by project
val commonsLangVersion: String by project

plugins {
  java
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(
    group = "org.jetbrains",
    name = "annotations",
    version = jbAnnotationsVersion
  )
  implementation(
    group = "org.apache.commons",
    name = "commons-lang3",
    version = commonsLangVersion
  )
  testImplementation(
    group = "org.junit.jupiter", name = "junit-jupiter-api",
    version = junitVersion
  )
  testRuntimeOnly(
    group = "org.junit.jupiter", name = "junit-jupiter-engine",
    version = junitVersion
  )
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_11
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}