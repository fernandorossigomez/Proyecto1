#  Project 1 - Restaurant Orders API

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.2-brightgreen)
![JPA](https://img.shields.io/badge/Spring%20Data-JPA-blue)
![Database](https://img.shields.io/badge/DB-H2-lightgrey)
![Status](https://img.shields.io/badge/Status-Completed-success)

---

##  Overview

REST API developed with **Spring Boot** for managing restaurant orders.  
The system allows handling orders, products, categories, and terminals, with preloaded test data using a `DataLoader`.

This project is designed as a backend practice to simulate a real restaurant ordering system.

---

##  Architecture

The project follows a layered architecture:

- **Controller** → REST endpoints
- **Service** → Business logic
- **Repository** → Data access layer
- **Entity** → Database models
- **DTO** → Request/Response models
- **Exception Handler** → Global error handling

---

##  Technologies

- Java 21
- Spring Boot 3.3.2
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Lombok
- Swagger / OpenAPI

---

##  Main Features

###  Orders Management
- Create orders linked to terminals
- Add/remove products to orders
- Update order status:
  - `PENDING`
  - `COMPLETED`
- Retrieve orders (single or list)

---

###  Products & Categories
- Products grouped into categories:
  - FOOD 
  - DRINK
  - DESSERT
- Many-to-one relationship between products and categories

---

###  Analytics
- Most sold product
- Least sold product
- Top selling products ranking

---

##  Test Data (DataLoader)

On startup, the system automatically loads:

- 3 Categories
- 10 Products
- 3 Terminals (Barra, Terraza, Sala)
- 5 Sample Orders with realistic data

This allows immediate API testing without manual setup.

---

##  API Endpoints

### Orders
- `POST /orders` → Create order
- `GET /orders` → Get all orders
- `GET /orders/{id}` → Get order by ID
- `PUT /orders/{id}` → Update order
- `DELETE /orders/{id}` → Delete order
- `PATCH /orders/{id}/status` → Update order status

### Order Products
- `POST /orders/{id}/products` → Add product to order
- `DELETE /orders/{id}/products/{productId}` → Remove product from order

### Statistics
- `GET /orders/most-sold`
- `GET /orders/least-sold`
- `GET /orders/top-products`

---

##  Swagger Documentation

Interactive API documentation available at:

http://localhost:8080/swagger-ui/index.html


###  Swagger Preview

<img width="1580" height="881" alt="image" src="https://github.com/user-attachments/assets/43a850a7-29e1-49f6-a203-ef2c90e4f543" />

---

##  Run the project

```bash
mvn spring-boot:run
