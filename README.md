# Student-Management-System
A Spring Boot MVC web application that allows users to perform CRUD (Create, Read, Update, Delete) operations on student records. The system provides a simple interface to manage student details such as first name, last name, and email.

---------------------------------------------------------------------------------------------------------------------------------
Features

• Add a new student
• View all students
• Update student details
• Delete a student
• Display student records in a structured table
• Simple and clean user interface using Thymeleaf

-----------------------------------------------------------------------------------------------------------------------------------
Technologies Used

Backend
• Java
• Spring Boot
• Spring MVC
• Spring Data JPA

Frontend
• HTML
• Thymeleaf

Database
• PostgreSql

Build Tool
• Maven

---------------------------------------------------------------------------------------------------------------------------------
Project Architecture

The application follows the Spring Boot MVC architecture.

Browser Request
↓
Controller Layer
↓
Service Layer
↓
Repository Layer
↓
Database

Controller receives the request, the service handles business logic, the repository communicates with the database, and the response is returned to the view.

Application Endpoints

GET /home
Displays the home page.

GET /students
Displays the list of all students.

GET /students/new
Shows the form to create a new student.

POST /students
Saves a new student record.

GET /students/edit/{id}
Displays the edit form for a student.

POST /students/edit/{id}
Updates student information.

GET /students/{id}
Deletes the selected student.

How to Run the Project

Step 1
Clone the repository

git clone https://github.com/yourusername/student-management-system.git

Step 2
Open the project in IntelliJ IDEA or any Java IDE.

Step 3
Configure database settings in application.properties.

Step 4
Run the main class:

StudentsManagementSystemApplication.java

Step 5
Open the browser and visit:

http://localhost:8080/home


Author
Prathamesh Nistane
