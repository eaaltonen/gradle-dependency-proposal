# Gradle Dependency Proposal

This is proposal for how to manage dependencies with [Gradle](https://gradle.org).

A) The default behaviour is to use fixed dependency versions specified in the
[build.gradle](build.gradle) file.

B) By supplying an **environment variable** `DEPS=latest`, the build will use
the latest versions of all dependencies, example

    DEPS=latest ./gradlew build
