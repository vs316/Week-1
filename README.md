# Week 1: Java Fundamentals

Welcome to the Week 1 repository of our Java learning journey! This week establishes your foundation in Java’s core syntax and essential programming constructs.

## Table of Contents

1. [Overview](#overview)  
2. [Topics Covered](#topics-covered)  
   - [Day 1: Introduction to Java](#day-1-introduction-to-java)  
   - [Day 2: Variables, Data Types, and Operators](#day-2-variables-data-types-and-operators)  
   - [Day 3: Control Flow (Conditionals & Loops)](#day-3-control-flow-conditionals--loops)  
   - [Day 4: Arrays](#day-4-arrays)  
   - [Day 5: Strings](#day-5-strings)  
   - [Day 6: Methods](#day-6-methods)  
3. [Prerequisites](#prerequisites)  
4. [Repository Structure](#repository-structure)  
5. [Getting Started](#getting-started)  
6. [Next Steps](#next-steps)  

---

## Overview

During this first week, you’ll learn how to write and run simple Java programs, manipulate different data types, control program flow with conditionals and loops, work with arrays and strings, and encapsulate logic into reusable methods. By week’s end, you should feel comfortable reading and writing basic Java code.

## Topics Covered

### Day 1: Introduction to Java
- **What is Java?** A high‑level, object‑oriented programming language.  
- **History & Use Cases:** From its 1995 release by Sun Microsystems to its ubiquity in enterprise, mobile, and web applications.  
- **Setup:** Install the latest Java Development Kit (JDK).  
- **First Program:** Your “Hello, World!” application.  
- **Anatomy of a Java Class:** Packages, classes, the `main` method, and the Java compiler/runtime workflow.

### Day 2: Variables, Data Types, and Operators
- **Variable Declaration & Initialization:** Naming conventions and best practices.  
- **Primitive Types:** `int`, `double`, `boolean`, `char`, etc., and their default values.  
- **Reference Types:** Brief intro to `String`.  
- **Operators:** Arithmetic (`+`, `-`, `*`, `/`, `%`), relational (`==`, `!=`, `<`, `>`), logical (`&&`, `||`, `!`), and assignment (`=`, `+=`, `-=`).  
- **Type Casting:** Implicit vs. explicit conversion.

### Day 3: Control Flow (Conditionals & Loops)
- **Conditionals:** `if` / `else if` / `else`, plus the `switch` statement.  
- **Loops:** `for`, `while`, and `do‑while`.  
- **Loop Control:** Using `break` to exit loops and `continue` to skip iterations.

### Day 4: Arrays
- **Definition:** Fixed‑size container for homogeneous data.  
- **Declaration & Initialization:** Single‑dimensional and multi‑dimensional arrays.  
- **Access & Traversal:** Index-based element access and iteration patterns.

### Day 5: Strings
- **`String` Class Basics:** Creating and comparing strings.  
- **Common Methods:** `.length()`, `.charAt()`, `.substring()`, `.equals()`, `.equalsIgnoreCase()`.  
- **Concatenation:** Using `+` and `StringBuilder`.  
- **Immutability:** Why strings can’t be changed after creation.

### Day 6: Methods
- **Purpose:** Encapsulate reusable logic.  
- **Declaration:** Syntax for access modifiers, return types, method names, and parameters.  
- **Invocation:** Calling methods and capturing return values.  
- **Overloading:** Defining multiple methods with the same name but different signatures.  
- **Modifiers:** The role of `static` vs. instance methods, and using `void`.

## Prerequisites

- **Hardware/OS:** A computer running Windows, macOS, or Linux.  
- **Software:**  
  - Java Development Kit (JDK) 8 or later  
  - A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

## Repository Structure
week-1-java-fundamentals/
├── day-1-introduction/
│ └── HelloWorld.java
├── day-2-variables-and-operators/
│ └── VariablesDemo.java
├── day-3-control-flow/
│ ├── ConditionalDemo.java
│ └── LoopDemo.java
├── day-4-arrays/
│ └── ArraysDemo.java
├── day-5-strings/
│ └── StringsDemo.java
└── day-6-methods/
└── MethodsDemo.java

Each folder contains sample code, exercises, and notes for that day.

## Getting Started

1. **Clone the repo**  
   ```bash
   git clone https://github.com/yourusername/week-1-java-fundamentals.git
   cd week-1-java-fundamentals
2. **Compile and Run**
   javac day-1-introduction/HelloWorld.java
   java -cp day-1-introduction HelloWorld
3. Explore: Open each day’s folder, read the code, and try modifying or extending the examples.
