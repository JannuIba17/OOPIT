markdown
# 📚 Library Management System (Mini Project - Unit 1)

## 🎯 Objective
This project demonstrates the integration of **Object-Oriented Programming (OOP)** concepts, **Java Collections**, and **Exception Handling** into a cohesive **command-line application**.  
It models a simple library system where books can be added, issued, returned, and late fees are calculated using custom exceptions.

---

## 📝 Description
The system is built around three core classes:

- **Book**  
  Represents a book with attributes like `id`, `title`, `author`, and `availability`.

- **Member**  
  Represents a library member with attributes like `memberId`, `name`, and a list of issued books.

- **Library**  
  Manages the collection of books and members using a **HashMap**.  
  Provides methods to:
    - Add new books
    - Issue books to members
    - Return books
    - Calculate late fees using **custom exceptions** for invalid returns

All operations are logged to a **text file** for record-keeping.  
The program uses a **menu-driven interface** for user interaction.

---

## 📂 Project Structure
LibraryManagementSystem/ 
│    ├── src/ 
│       ├── Book.java 
│       ├── Member.java 
│       ├── Library.java 
│       ├── LibraryManagementSystem.java # Main class with menu-driven 
interface 
│       ├── logs/ 
│           └── operations.txt # Log file for all actions 
│ 
└── README.md # Project documentation

Code

---

## ⚙️ Compilation & Execution Steps

### 1. Clone the Repository
```bash
git clone https://github.com/<your-username>/LibraryManagementSystem.git
cd LibraryManagementSystem/src
2. Compile the Source Code
bash
javac *.java
3. Run the Program
bash
java LibraryManagementSystem
🚀 Key Concepts Practiced
Encapsulation, Inheritance, and Polymorphism

Java Collections (HashMap)

Custom Exceptions

File Handling (logging operations)

Menu-driven command-line interface

Code

---
