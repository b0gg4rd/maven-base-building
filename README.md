# MVN Java Building

Basic building structure with **Apache Maven** for **Java** development.

## Requirements

- [JDK 8](http://openjdk.java.net/)
- [Apache Maven 3.3.9](https://maven.apache.org/)

## Building

The first time just use:

`$ mvn -N io.takari:maven:wrapper`

For develop cycle use:

`$ ./mvnw clean package`

For execute use:

`$ java -jar target/app.jar`

