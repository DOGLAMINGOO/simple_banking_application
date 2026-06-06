# Banking App

A simple Spring Boot example for learning. Implements basic account management (CRUD) with a layered design.

## Used

* Java 17
* Spring Boot (Web MVC)
* Spring Data JPA (Hibernate as the JPA provider)
* MySQL (JDBC connector)
* Lombok (for boilerplate reduction)
* Maven (build)

## Key Features

* Account CRUD operations via REST controllers
* Persistence with Spring Data JPA repositories
* DTOs and mapper layer to separate API models from entities
* Global exception handling using `@ControllerAdvice`
* Custom exception and standardized error responses for account-related and server errors
