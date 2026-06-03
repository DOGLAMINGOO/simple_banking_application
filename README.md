# Banking App

A simple Spring Boot example for learning. Implements basic account management (CRUD) with a layered design.

Used:
- Java 17
- Spring Boot (Web MVC)
- Spring Data JPA (Hibernate as the JPA provider)
- MySQL (JDBC connector)
- Lombok (for boilerplate reduction)
- Maven (build)

Key features:
- Account CRUD operations via REST controllers
- Persistence with Spring Data JPA repositories
- DTOs and mapper layer to separate API models from entities

Run:
- Configure database in `src/main/resources/application.properties`.
- Start with the Maven wrapper: `./mvnw spring-boot:run`.

That's it — concise and focused for learning Spring Boot.
