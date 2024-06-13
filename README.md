# Microservices

This project demonstrates a microservices architecture implemented with Spring Boot. It showcases the separation of functionalities into two independent services: User Service and Hotel Service. Each service manages its own database and exposes RESTful APIs for interaction.

## Project Structure

* **user-service:** This directory contains the User Service implementation.
* **hotel-service:** This directory contains the Hotel Service implementation.
* **common:** (Optional) This directory can house any shared code or configuration between the services (e.g., utility classes, common API models).

## Services

### User Service

* **Database:** MySQL
* **Description:** Manages user data, including creating, retrieving, and listing users.
* **Endpoints:**
    * `POST /users`: Creates a new user
    * `GET /users/{userId}`: Retrieves a user by ID
    * `GET /users`: Lists all users
* **Technologies:**
    * Spring Boot
    * Spring Data JPA
    * MySQL
    * Lombok (optional)

### Hotel Service

* **Database:** PostgreSQL
* **Description:** Manages hotel data, including creating, retrieving, and listing hotels.
* **Endpoints:**
    * `POST /hotels`: Creates a new hotel
    * `GET /hotels/{hotelId}`: Retrieves a hotel by ID
    * `GET /hotels`: Lists all hotels
* **Technologies:**
    * Spring Boot
    * Spring Data JPA
    * PostgreSQL
    * Lombok (optional)

## Exception Handling

Both services implement robust exception handling mechanisms to return meaningful error messages for potential issues encountered during API calls.
