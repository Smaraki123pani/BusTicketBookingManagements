
# Online Bus Ticket Booking Application System

## Overview 
This project is an Online Bus Ticket Booking Application developed using Java with Spring Boot for the backend and Thymeleaf for the frontend. The application allows users to book bus tickets online, view available bus schedules, and manage their bookings.
## Table of Contents
+ Introduction
+ Features
+ Technologies Used
+ Project Structure
   + DTO
   + Entities
   + Repositories
   + Services
   + Controllers
+ Running the Application
   + Prerequisites
   + Steps
+ Usage
   + User Registration and Login
   + Admin Functionalities
   + Booking Tickets 
   + Frontend
### Features
+ User Registration and Authentication
+ View Available Buses and Schedules
+ Book Tickets Online
+ View and Manage Bookings
+ Admin Panel for Managing Buses and Schedules
+ Responsive UI with Thymeleaf
### Technologies Used
+ Java
+ Spring Boot
+ Spring Security
+ Thymeleaf
+ iTextPDF for PDF generation
+ Lombok
+ Jakarta Servlet API
### Project Structure
### DTO
Data Transfer Objects used for transferring data between different layers of the application.

**UserDto.java**: A DTO for user registration and login.
Entities
Database entities representing the core components of the system.

**Passengers.java**: Entity representing passengers.
**Bus.java**: Entity representing buses.
**Booking.java**: Entity representing bookings.
**PassengerDetail.java**: Entity representing details of passengers in a booking.
### Repositories
Interfaces for data access operations.

**PassengerRepository.java**: Repository for Passengers entity.

**BusRepository.java**: Repository for Bus entity.

**BookingRepository.java**: Repository for Booking entity.
### Services
Business logic of the application.

**PassengerService.java**: Implements UserService interface and handles passenger-related operations.

**GeneratePdfService.java**: Service for generating PDFs.

**CustomUserDetailService.java**: Service for loading user details for Spring Security.

**CustomHandlerUsers.java**: Custom authentication success handler.

**BusService.java**: Handles bus-related operations.

**BookingService.java**: Handles booking-related operations.
### Controllers
Controllers to handle HTTP requests.

**PassengerController.java**: Handles passenger-related endpoints.

**BusController.java**: Handles admin and bus-related endpoints.

**BookingController.java**: Handles booking-related endpoints.
## Running the Application
### Prerequisites
+ Java 17 or higher
+ Maven 
+ A relational database (e.g., MySQL)
### Steps
1. Clone the repository

git clone:
 `https://github.com/your-username/BusTicketBookingManagements.git`

2. Configure the database

Update the `application.properties` file in `src/main/resources` with your database configuration.

3. Build the project
`
mvn clean install`

4. Run the application
`mvn spring-boot:run`

5. Access the application

Navigate to `http://localhost:8080` in your web browser.

### Usage
**User Registration and Login**
+ Register a new user by accessing `/registration`.
+ Login with registered credentials at `/login`.
**Admin Functionalities**
+ Access the admin page at `/admin` after logging in as an admin.
+ Add a new bus via `/addBus`.
+ View all buses at `/viewAllBuses`.
+ Find a bus by ID at `/findBusById`.
+ Update bus details via `/updateByBus`.
+ Delete a bus via `/delete/{serialNo}`.
**Booking Tickets**
+ Search for buses from the user home page.
+ Book a bus via `/bookBus/{busId}`.
+ View bookings at `/bookings`.
+ Generate PDF of a booking at `/generatePdf/{bookingId}`.

## FrontEnd
-To see this project FrontEnd Part as well Documentation an ScreenShots. Here, I have attached the generated Pdf files.

--- 

***Thanks to the Spring Boot and Spring Security teams for providing such powerful frameworks.***

***Special thanks to the Thymeleaf community for the excellent templating engine. Gratitude to the creators of iTextPDF for the PDF generation library***.

---
Happy Coding