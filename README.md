# OOP_Basics_Intro

This project is a simple Java application designed to introduce the fundamental concepts of Object-Oriented Programming (OOP). It includes examples of **classes**, **objects**, **inheritance**, and **polymorphism**.

---

## Features
- Demonstrates **encapsulation** through private fields and public methods.
- Showcases **inheritance** with a `Dog` class that extends an `Animal` class.
- Illustrates **method overriding** for custom behavior.
- Contains a `main` method to execute and observe OOP principles in action.

---

## Code Overview

### 1. `Animal` Class
- Encapsulates attributes like `name` and `age`.
- Provides common methods like `eat()` and `sleep()` for all animals.
- Overrides `toString()` to provide meaningful object descriptions.

### 2. `Dog` Class (Subclass)
- Extends the `Animal` class.
- Adds a unique attribute: `breed`.
- Includes a new method: `bark()`.
- Overrides the `toString()` method to include the breed information.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE like **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `Main.java` file to see the output.

---

## Sample Output

```plaintext
GenericAnimal is eating.
GenericAnimal is sleeping.
Buddy is eating.
Buddy is sleeping.
Woof! Woof!
Animal [name=GenericAnimal, age=5]
Animal [name=Buddy, age=3], Breed=Golden Retriever
