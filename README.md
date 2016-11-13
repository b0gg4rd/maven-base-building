# MVN Java Building

Basic building structure with **Apache Maven** for **Java** development.

## Requirements

- [JDK 8](https://openjdk.org/)
- [Apache Maven](https://openjdk.org/)

## Building

The first time just use:

`$ mvn -N io.takari:maven:wrapper`

For develop cycle use:

`$ ./mvnw clean package`

For execute use:

`$ java -jar target/app.jar`

