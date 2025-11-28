# 🏨 Java Hotel Management System

A console-based Hotel Management System written in **Core Java**.  
This project allows hotel staff to manage room bookings, food ordering, and billing operations.

---

## 📌 Features

### 🛏 Room Management
- View available rooms
- Room types included:
  - AC Room
  - Non-AC Room
  - Deluxe Room
  - Luxury Room
- Room booking with price and facilities
- Automatic availability checking

### 🍽 Food Ordering
- Order Meals and Snacks
- Menu-driven ordering system
- Per item pricing

### 🧾 Billing
- Calculates total bill:
  - Room Charges
  - Food Charges
  - GST/Tax (if added)
- Prints final receipt

---

## 📁 Project Structure

Java Hotel Project/
├── src/
│ └── com/mohan/
│ ├── billing/
│ │ ├── Bill.java
│ │ ├── Billing.java
│ │ └── Prices.java
│ ├── food/
│ │ ├── Meals.java
│ │ └── Snaks.java
│ ├── main/
│ │ ├── Hotel.java
│ │ └── HotelApp.java
│ └── rooms/
│ ├── Room.java
│ ├── RoomFaci.java
│ ├── RoomBook.java
│ ├── ACRoom.java
│ ├── NonAC.java
│ ├── Deluxe.java
│ └── LuxuryRoom.java
└── bin/ (Auto generated)


---

## 🛠 Technologies Used

| Technology | Purpose |
|-----------|----------|
| Java      | Core logic and OOP |
| OOP       | Inheritance and Polymorphism |
| Scanner   | Input handling |
| Collections | Internal storage |

---

## ▶ How to Run the Project

### **Option 1: Using Command Line**
```bash
cd Java Hotel Project/src
javac com/mohan/main/HotelApp.java
java com.mohan.main.HotelApp

Option 2: Using Eclipse

1. Import project as Existing Java Project
2. Right-click HotelApp.java
3. Run → Run As → Java Application

🧩 Main Classes Overview

com.mohan.main
* HotelApp → Program entry point
* Hotel → Menu handler

com.mohan.rooms
* RoomBook → Books rooms
* Room → Parent class for room types
* ACRoom, NonAC, Deluxe, LuxuryRoom

com.mohan.billing
* Billing → Adds food + room charges
* Bill → Prints final bill
* Prices → Stores static prices

com.mohan.food
* Meals, Snaks → Food menu

🧠 Concepts Used
✔ Object Oriented Programming
✔ Inheritance
✔ Polymorphism
✔ Encapsulation
✔ Method Overriding
✔ Menu Driven Application
✔ Scanner Input

Sample Output

===== Welcome to Hotel Booking System =====
1. Book Room
2. Order Food
3. Checkout and Print Bill
Enter Choice:


👨‍💻 Author
Java Hotel Management Project by Mohan
Created using Core Java without frameworks.