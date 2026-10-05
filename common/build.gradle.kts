// Look into the possibility of splitting off the API portion into its own module? (Probably not worth it right now) - 12/22/23

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(21)
    }

    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }

    processResources {
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        filteringCharset = Charsets.UTF_8.name()
    }
}

dependencies {
    implementation("com.github.Anon8281:UniversalScheduler:0.1.7")
    compileOnly("io.papermc.paper:paper-api:1.21.10-R0.1-SNAPSHOT")
}