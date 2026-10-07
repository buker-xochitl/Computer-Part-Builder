# Computer Part Builder

A Java console application that allows users to build a customized **desktop or laptop computer** by selecting different brands and components.

This project was created for CSC 1060 and demonstrates object-oriented programming concepts including inheritance, encapsulation, constructors, input validation, and multi-class program design.

## Features

* Choose between Desktop or Laptop
* Select computer brands and CPU options
* Choose storage and display components
* Automatically calculate the total cost
* Validate user selections
* Build multiple computers in one session

## Technologies & Concepts

* Java
* Object-Oriented Programming
* Inheritance
* Encapsulation
* Constructors
* Input Validation
* Loops and Conditional Statements

## Project Structure

```text
Computer-Part-Builder/
├── Computer.java
├── Desktop.java
├── Laptop.java
└── midterm_driver.java
```

`Computer` serves as the parent class, while `Desktop` and `Laptop` extend it with their own specialized components. The `midterm_driver` class contains the `main()` method and manages user interaction and program flow.

## How to Run

Compile and run the program:

```bash
javac Computer.java Desktop.java Laptop.java midterm_driver.java
java midterm_driver
```

## What I Learned

This project gave me hands-on experience designing a multi-class Java program and applying object-oriented concepts such as inheritance and encapsulation. I also practiced input validation, constructors, loops, and calculating results from user selections.

## Author

**XoChitl Buker**
CSC 1060 — Midterm Programming Project
