# springboot-ecommerce-jwt
Spring Boot E-commerce backend with JWT Authentication, Spring Security, REST APIs, and PostgreSQL integration
# 🛒 Spring Boot E-commerce Backend with JWT Authentication

## 🚀 Overview

This project is a backend e-commerce application built using **Spring Boot**, implementing secure authentication using **JWT (JSON Web Tokens)** and **Spring Security**. It provides RESTful APIs for user authentication and product management.

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Security
* JWT (io.jsonwebtoken)
* Spring Data JPA
* PostgreSQL
* Maven

---

## 🔐 Features

* User Registration (`/auth/register`)
* User Login with JWT Token (`/auth/login`)
* Stateless Authentication using JWT
* Secure API endpoints
* RESTful API architecture

---

## 📂 Project Structure

```
com.example.demo
│
├── controller        # REST Controllers
├── service           # Business logic
├── repository        # JPA Repositories
├── model             # Entity classes
├── dto               # Request/Response DTOs
├── security          # JWT + Security configuration
└── DemoApplication   # Main class
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository

```
git clone https://github.com/your-username/springboot-ecommerce-jwt.git
cd springboot-ecommerce-jwt
```

### 2️⃣ Configure Database (PostgreSQL)

Update `application.properties`:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

---

### 3️⃣ Run the application

```
./mvnw spring-boot:run
```

---

## 📬 API Endpoints

### 🔹 Register User

POST `/auth/register`

```json
{
  "username": "test",
  "password": "123"
}
```

---

### 🔹 Login User

POST `/auth/login`

```json
{
  "username": "test",
  "password": "123"
}
```

✅ Response:

```json
{
  "token": "your-jwt-token"
}
```

---

### 🔹 Access Protected API

GET `/products`

Add Header:

```
Authorization: Bearer <your-token>
```

---

## 🧪 Testing with Postman

* Register a user
* Login to get JWT token
* Use token in Authorization header to access secured endpoints

---

## 🔥 Future Improvements

* Add product CRUD APIs
* Add order management
* Add role-based authorization (Admin/User)
* Integrate frontend (React/Angular)
* Add Swagger API documentation

---

## 👨‍💻 Author

Sai Jayanth Chintamaneni

---

## ⭐ If you like this project

Give it a star ⭐ on GitHub!
