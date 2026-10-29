
# 🚗 Car Dealership Management System

A console-based Java application that simulates the basic operations of a car dealership. Users can enter customer details, browse available vehicles, select a car, and choose whether to use the application's basic financing option.

## 🚀 Features

- 👤 Collects customer information, including name, address, and available cash.
- 🚘 Displays available vehicles and their prices.
- 💰 Checks whether the customer has sufficient funds for a purchase.
- 🏦 Provides a basic simulated vehicle financing workflow.
- 🧾 Displays purchase information when a transaction is successful.
- 🏗️ Uses object-oriented programming to organize customer, vehicle, and employee operations.

## 🛠️ Tech Stack

- **Language:** Java
- **Input Handling:** Java Scanner
- **Concepts:** Object-Oriented Programming, Encapsulation, Constructors, Getters, Setters, Conditional Statements, Switch Statements

## 📁 Project Structure

```text
Car_dealership_project/
└── src/
    ├── Main.java
    ├── Customer.java
    ├── Employee.java
    └── Vehicle.java
```

## ⚙️ How It Works

1. **Customer Details:** The application asks the user to enter their name, address, and available cash.
2. **Vehicle Selection:** It displays two vehicles:
   - Honda Accord — 17,000
   - BMW M3 — 25,000
3. **Financing Choice:** The customer chooses whether to use the financing option.
4. **Purchase Processing:** The `Employee` class handles the purchase logic.
5. **Transaction Result:** The application displays purchase confirmation if the customer can pay, or a message indicating that additional funds are needed.

## ▶️ Getting Started

### Prerequisites

- Java Development Kit (JDK)
- A Java IDE such as IntelliJ IDEA or Eclipse, or a terminal with Java installed

### Run the Application

1. Clone the repository:

   ```bash
   git clone YOUR_CAR_DEALERSHIP_GITHUB_URL
   ```

2. Open the project in your Java IDE.

3. Compile the Java source files:

   ```bash
   javac src/*.java
   ```

4. Run the application:

   ```bash
   java -cp src Main
   ```

## 🧩 Classes and Responsibilities

### `Main.java`
Acts as the entry point. It collects user input, displays the vehicle list, and initiates the purchase workflow.

### `Customer.java`
Stores customer details and invokes the employee's purchase-handling method.

### `Vehicle.java`
Represents a vehicle with its brand, model, and price. It includes constructors, getters, setters, and a `toString()` method.

### `Employee.java`
Handles the purchase process, checks whether the customer can afford the selected vehicle, and simulates a credit-history check when financing is selected.

## 🎯 Learning Outcomes

- Applying object-oriented programming in Java.
- Creating classes and objects to model real-world entities.
- Using constructors, getters, and setters.
- Handling console input with `Scanner`.
- Implementing conditional logic and switch statements.
- Separating responsibilities across multiple Java classes.

## 🔮 Future Improvements

- Add input validation for invalid customer details and vehicle selections.
- Improve the financing workflow with realistic loan calculations.
- Store customer and transaction information persistently.
- Add more vehicle models and configurable prices.
- Correct the cash-bonus logic so it is applied only once.
- Add unit tests for purchase and financing scenarios.

## 👨‍💻 Author

**Ansh Chaudhary**

- GitHub: [AnshChaudhary9](https://github.com/AnshChaudhary9)

---

⭐ If you find this project useful, consider giving the repository a star!
