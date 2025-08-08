# Movie Review App - Backend

## Overview
This is the backend for the Movie Review Application, built with **Java Spring Boot** and **MongoDB**.  
It provides RESTful APIs to manage movies and user reviews, supporting full CRUD operations with persistent storage.

---

## Features
- CRUD operations for movies and reviews
- Spring Data MongoDB integration
- JSON request validation and structured API responses
- Environment-based configuration via `application.properties`
- Easily extensible for authentication, Swagger docs, and more

---

## Prerequisites
- Java 11+  
- Maven  
- MongoDB (local or Atlas)

---

## Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd backend
   ```

2. Configure MongoDB connection in:
   ```
   src/main/resources/application.properties
   ```
   Example for local MongoDB:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/moviereviews
   ```
   Example for MongoDB Atlas:
   ```properties
   spring.data.mongodb.uri=<your-atlas-connection-string>
   ```

---

## Running the Application

### Using Maven:
```bash
mvn spring-boot:run
```

### Using Java:
```bash
mvn clean package
java -jar target/<generated-jar-file>.jar
```

---

## API Endpoints

| Method | Endpoint                          | Description                       |
|--------|-----------------------------------|-----------------------------------|
| GET    | `/api/movies`                     | Get all movies                    |
| POST   | `/api/movies`                     | Create a new movie                |
| GET    | `/api/movies/{id}`                 | Get a movie by ID                 |
| PUT    | `/api/movies/{id}`                 | Update a movie                    |
| DELETE | `/api/movies/{id}`                 | Delete a movie                    |
| GET    | `/api/movies/{id}/reviews`         | Get reviews for a movie           |
| POST   | `/api/movies/{id}/reviews`         | Add a review for a movie          |

---

## Project Structure
```
src
├── main
│   ├── java
│   │   ├── controller
│   │   ├── model
│   │   ├── repository
│   │   └── service
│   └── resources
│       └── application.properties
└── test
    └── java
```

---

## Troubleshooting
- **MongoDB connection error:** Verify URI and ensure MongoDB is running.
- **Port already in use:** Change in `application.properties`:
  ```properties
  server.port=8081
  ```

---

## License
This project is for educational purposes based on the referenced tutorial video.
