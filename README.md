# JDBC-Benchmark-app

## Build and run application

To compile production Java source files using the JDK compiler:

`gradle compileJava`

To assemble the production JAR file, based on the classes and resources attached to the `main` source set:

`gradle jar`

To aggregate tasks that performs a full build of the project:

`gradle build`

To see another gradle tasks:

`gradle tasks`

For passing arguments `foo bar` to application via Gradle use key:

`--args='-foo bar'`