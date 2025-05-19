🚆 Railway Reservation System – REST API
📄 Project Description
The Railway Reservation System REST API is a Spring Boot-based backend application designed to simplify and automate the process of booking, managing, and retrieving train tickets. This system simulates a real-world railway ticketing platform, enabling users to reserve tickets, check availability, and retrieve passenger and journey details through a RESTful interface.

It serves as a lightweight, scalable, and easily testable backend service for web, desktop, or mobile frontends.

✅ Key Features
🎟️ Book train tickets with passenger details

🔍 Search journey routes (from station → to station)

📆 Manage and view reservation status

📄 Auto-generated Swagger UI documentation

🛠️ Clean RESTful architecture with JSON support

🧱 Technology Stack
Layer	Technology
Language	Java 17
Framework	Spring Boot (v3.4.5)
REST Docs	Springdoc OpenAPI 3 (Swagger)
Build Tool	Maven
HTTP Library	Spring Web

🌐 Swagger UI Endpoint
Access the live API documentation and test endpoints here (after running the app):

bash
Copy code
http://localhost:8080/swagger-ui/index.html
📦 Sample API: Book Ticket
POST /book

json
Copy code
{
  "fname": "Rahul",
  "lname": "Verma",
  "from": "New Delhi",
  "to": "Kolkata",
  "journeyDate": "2025-06-01"
}
Response:

json
Copy code
{
  "name": "Rahul Verma",
  "from": "New Delhi",
  "to": "Kolkata",
  "journeyDate": "2025-06-01",
  "ticketStatus": "CONFIRMED",
  "ticketPrice": "5000.00 INR"
}
👨‍💻 Use Case
This project is ideal for:

Academic and training purposes (e.g., final year B.Tech project)

Demonstrating REST API principles

Testing frontend integrations with railway-like services

Extending into a full-stack Railway Reservation System
