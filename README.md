# Number Translator & Mastermind – NOVI Backend Java Assignment

## About the Project

This repository contains my solution to the **Number Translator** assignment, including the optional **Mastermind** challenge, from the Backend Java module at [Novi University](https://www.novi.nl).

The main goal of this project is to practice using:
- **HashMaps** to map numbers to words
- **Loops**, **decision structures**, and **object-oriented programming** to build a console-based translator app
- Use **collections**, **random number generation**, and logical comparison in the Mastermind game

---

## Table of Contents

- [Tech Stack](#tech-stack)
- [Key Features](#key-features)
- [How to Run](#how-to-run)
- [Credits](#credits)
- [License](#license)

---

## Tech Stack

- **Java 17**+
- **IntelliJ IDEA**

---

## Key Features

- `Translator` class that:
    - Maps numeric values (0–9) to their word equivalents (e.g. 0 -> "nul", 1 -> "een", etc.)
    - Reads user input via Scanner 
    - Checks for invalid input and handles edge cases gracefully 
    - Core translation logic is encapsulated in the Translator class for reuse
-  `Mastermind` class with a basic version of the Mastermind game

## How to Run

1. Open the project in your IDE (IntelliJ IDEA)
2. Locate the `main` method and click the green play button **Run 'Main'** or use the terminal:
    ```bash
    ./mvnw clean compile exec:java
    ```

## Credits
> "This assignment was developed as part of the Backend Java module in the NOVI Software Development program. All instructions, logic, and structure are part of the official coursework."

## License
> "This repository is intended for educational purposes only. You are welcome to use the code for learning, but not for commercial use."