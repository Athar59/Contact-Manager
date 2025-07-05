# Spring Boot Contact Manager

A simple **Contact Manager REST API** built with **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
This project demonstrates CRUD operations and search functionality for managing contacts.

---

## 📌 Features

✅ Create, read, update, and delete contacts  
✅ Search contacts by name  
✅ RESTful API design with JSON input/output  
✅ Exception handling for not found resources  
✅ Uses MySQL   
✅ Layered architecture (Controller, Service, Repository)

---

## 📌 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (for API testing)

---

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/contacts`                 | Get all contacts           |
| GET    | `/api/contacts/{id}`            | Get a contact by ID        |
| POST   | `/api/contacts`                 | Create a new contact       |
| PUT    | `/api/contacts/{id}`            | Update an existing contact |
| DELETE | `/api/contacts/{id}`            | Delete a contact           |
| GET    | `/api/contacts/search?name=John`| Search contacts by name    |

---

### ✔️ Example JSON for POST

```
{
  "name": "John Doe",

  "email": "john@example.com",

  "phone": "123-456-7890"
}
```

---

## 📌 How to Run Locally

Clone the repository:

```bash

git clone https://github.com/your-username/springboot-contact-manager.git
```

Open in your IDE (e.g., Spring Tool Suite or IntelliJ IDEA).

Configure the database in \`src/main/resources/application.properties\`

Run the application:

In your IDE: Right-click \`ContactManagerApplication\` → \`Run As → Spring Boot App\`

Or with Maven:

```bash
./mvnw spring-boot:run
```

Test the API with Postman.

---

## 📌 Project Structure

```none
src/main/java/com/contactmanager/
│
├── controller/
│   └── ContactController.java
│
├── model/
│   └── Contact.java
│
├── repository/
│   └── ContactRepository.java
│
├── service/
│   └── ContactService.java
│
├── exception/
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
│
└── ContactManagerApplication.java
```

## 📌 Author

**Mohammad Atharuddin**  
📧 mdathar7262@gmail.com
