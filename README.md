# day5project1

A simple Java project using Maven. It includes a sample `App` class that inserts and prints bug records via `BugDAO`.

## Project structure

- `pom.xml` - Maven project descriptor
- `src/main/java/com/example` - application sources
- `src/test/java/com/example` - unit tests
- `target/` - build output

## Prerequisites

- Java 17 SDK
- Maven 3.6+

## Build

```bash
mvn clean package
```

## Run

Run the main class with Maven Exec:

```bash
mvn exec:java
```

If `exec-maven-plugin` is not configured, run explicitly:

```bash
mvn exec:java -Dexec.mainClass=com.example.App
```

## Tests

```bash
mvn test
```

## Notes

- The project currently uses PostgreSQL driver dependency (`org.postgresql:postgresql`).
- Make sure a PostgreSQL database is reachable if `BugDAO` uses a live database connection.
