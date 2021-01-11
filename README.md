Common formatting is a library based on [phormat](https://github.com/user11681/phormat) that implements multiple types of formatting in order to allow multiple mods to reuse them without conflicts.

build.gradle:
```groovy
repositories {
    // . . .
    maven {url = "https://dl.bintray.com/user11681/common-formatting"}
}

dependencies {
    // . . .
    modApi("user11681:common-formatting:+") // or choose a specific version
}
```
