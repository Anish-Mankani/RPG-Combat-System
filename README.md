# RPG Combat System ⚔️

A simple **console-based RPG combat simulation** built using **Java** and **Object-Oriented Programming (OOP)** principles.
The project demonstrates how different character types interact in a **turn-based combat system**.

---

## Features

* Turn-based battle simulation
* Different character types (**Warrior**, **Mage**)
* Mana-based spell system
* Randomized attack damage
* Health and survival mechanics
* Special abilities using interfaces

---

## Characters

### Warrior

* Strong melee fighter
* Deals consistent physical damage
* High health and strength

### Mage

* Uses **mana** to cast spells
* Can perform powerful **special skills**
* Lower health but higher magical damage potential

---

## Concepts Used

This project demonstrates several important **Java OOP concepts**:

* **Abstraction** – Implemented using the `GameCharacter` abstract class
* **Inheritance** – `Warrior` and `Mage` extend `GameCharacter`
* **Polymorphism** – Different characters implement the same `attack()` method differently
* **Interfaces** – `SpecialSkill` interface for advanced abilities
* **Collections** – `ArrayList` used to manage the party of characters
* **Randomization** – Attack damage varies using Java's `Random` class

---

## Technologies

* **Java**
* **Maven**
* **Object-Oriented Programming**

---

## Project Structure

```
src
└── main
    └── java
        └── org.example
            ├── Main.java
            └── model
                ├── GameCharacter.java
                ├── Warrior.java
                ├── Mage.java
                └── SpecialSkill.java
```

---

## Example Gameplay

```
--- New Round ---
Thor attacks Dragon dealing 18 damage
Gandalf casts Fireball at Dragon dealing 12 damage
Dragon attacks Thor dealing 15 damage
```

---

## Purpose

This project was built to practice **core Java programming and OOP design concepts** by implementing a simple RPG-style combat system.

---

## Author

**Anish Mankani**



