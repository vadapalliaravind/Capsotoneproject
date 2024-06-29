Below are the steps and instructions through the process:
1. Project Setup : (Code added in github)
First, set up Spring Boot project using either Spring Initializr method. including the necessary dependencies in pom.xml (if using Maven):
spring-boot-starter-web: For building RESTful APIs.
spring-boot-starter-data-jpa: For data access using Spring Data JPA.
spring-boot-starter-validation: For validation of request parameters and bodies.
springdoc-openapi-ui: For generating API documentation using Swagger.
 MYSQL steps:
MYSQL installation completed and created dbname and created new table structure as Todo. 
CREATE TABLE Todo(id BIGINT AUTO_INCREMENT PRIMARY KEY,
Title VARCHAR(255) NOT NULL,
Description VARCHAR(255) NOT NULL,
completed BOOLEAN NOT NULL,
created_at TIMESTAMP); 

Started testing using POSTMAN as below 
3.Postman testing
Using Postman or any API testing tool to verify the functionality of the endpoints.
GET /todos: Fetch all todos.
POST /todos: Create a new todo.
GET /todos/{todoId}: Fetch a todo by ID.
PUT /todos/{todoId}: Update a todo by ID.
PATCH /todos/{todoId}: Mark a todo as complete.
DELETE /todo/{todoId}: Delete a todo by ID.
GET /todo/count: Get the total count of todos.
4. Documentation
Swagger UI is set up correctly to document of API:
Access Swagger UI at http://localhost:8080/swagger-ui.html to view and interact with the API documentation.
