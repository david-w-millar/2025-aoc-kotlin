plugins {
  kotlin("jvm") version "2.2.21"
}

sourceSets {
  main { kotlin.srcDir("src") }
}


kotlin { jvmToolchain(24) }

tasks {
  wrapper { gradleVersion = "9.2.1" }
}
