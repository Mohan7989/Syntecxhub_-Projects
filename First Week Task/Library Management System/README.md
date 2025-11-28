
# 📚 Library Management System – Core Java (Console Application)

## 📘 About the Project

This is a **console-based library management system** where users can:

* Add new books
* Remove books
* Search books
* Collect/Borrow books
* Return books
* Display all available books

It is designed using pure core Java with:

* Classes & Objects
* Encapsulation
* ArrayList
* LocalDate API
* Menu-Driven Structure
* Clean separation of logic

Perfect for Java beginners, college mini-projects, and interview practice.

---

## 🚀 Features

### ✔ Add Books

Add a new book by entering title and author. The system automatically sets:

* Availability = true
* Publication date = current date

### ✔ Remove Books

Remove a book by its title (case-insensitive).

### ✔ Search Books

* Search by **Title**
* Search by **Author**

Supports multiple matches.

### ✔ Display All Books

Shows full details of every book in the library.

### ✔ Borrow / Collect Books

Marks book as unavailable.

### ✔ Return Books

Marks book as available again.

### ✔ Menu-driven Console UI

---

## 🛠 Technologies Used

* **Java SE (Core Java)**
* **OOP Principles**
* **Collections Framework (ArrayList)**
* **Java Time API (LocalDate)**
* **Scanner** for input

---

## 📂 Project Structure

```
src/
 └── com.mohan/
      ├── BookModel/
      │    └── Book.java
      ├── Library/
      │    └── Library.java
      └── main/
           └── Library_Management_System.java
```



## 📦 Class Details

### 📘 Book.java

Represents a book with:

* `title`
* `author`
* `isAvailable` (boolean)
* `publicationDate`

Also contains:

* Constructor
* Getters & setters
* equals(), hashCode()
* toString()

---

### 📚 Library.java

Handles **all the logic**, including:

* `addBook()`
* `removeBook()`
* `searchBook_byTitle()`
* `searchBook_byAuthor()`
* `displayBooks()`
* `collectingBook()`
* `returnBook()`

Uses:

```java
private ArrayList<Book> books = new ArrayList<>();
```

---

### 🖥 Library_Management_System.java

The main class that:

* Shows menu
* Uses Scanner
* Handles user choice
* Calls library methods
* Runs in a loop until Exit


## ▶️ How to Run

### 1️⃣ Clone or Download the Project

```bash
git clone <your-repo-url>
```

### 2️⃣ Compile the Code

```bash
javac com/mohan/**/*.java
```

OR simply compile in IDE (VS Code / Eclipse / IntelliJ).

### 3️⃣ Run the Application

```bash
java com.mohan.main.Library_Management_System
```

---

## 🖥 Sample Output
-------------------------------
=== Welcome to My Library ===
1. Add Book
2. Remove Book
3. Search by Title
4. Search by Author
5. Show All Books
6. Collect Book
7. Return Book
8. Exit
Choose an option:


Example:
-------------

Enter Book Title: Java Programming
Enter Author Name: James Gosling
Book was added successfully.


## 🧑‍🏫 Learning Outcomes

From this project, you learn:

* Class design & object creation
* Encapsulation
* Collections (ArrayList)
* Working with dates (LocalDate)
* Menu-driven programs
* Searching/filtering logic
* Clean code structure



## 👨‍💻 Author

**Neela Mohan**
Java Developer | Backend Learner | Building Projects Everyday
