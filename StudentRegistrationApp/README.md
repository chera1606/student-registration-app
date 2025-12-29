# Student Registration Web Application

This is a simple Java Servlet web application that allows users to register students
into a database and view all registered students in a table.

The project is built for learning purposes using Java Servlets, JSP, JDBC, and MySQL.

---

## 📌 Features

- Register a student (Name, Email, Year)
- Store student data in MySQL database
- View all registered students in an HTML table
- Uses Java Servlets and JSP

---

## 🛠 Technologies Used

- Java
- Java Servlets
- JSP
- JDBC
- MySQL
- Apache Tomcat
- Maven
- VS Code

---

## 🗄 Database Schema

**Database name:** `student_db`

**Table:** `students`

| Column | Type         | Constraints                 |
| ------ | ------------ | --------------------------- |
| id     | INT          | Primary Key, Auto Increment |
| name   | VARCHAR(100) | NOT NULL                    |
| email  | VARCHAR(100) | NOT NULL, UNIQUE            |
| year   | INT          | NOT NULL                    |

---

## 👨‍🎓 Author

Cherinet Derbie
