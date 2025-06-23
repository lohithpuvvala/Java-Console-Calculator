# Java-Console-Calculator


A simple interactive console-based calculator written in Java. It supports basic arithmetic operations like addition, subtraction, multiplication, division, and modulus, with support for floating-point numbers.

---

## ✨ Features

- ✅ Addition, Subtraction, Multiplication, Division, Modulus
- ✅ Handles decimal numbers (`double`)
- ✅ Division and modulus-by-zero error handling
- ✅ Looping interface with "quit" option
- ✅ Result formatted to 3 decimal places

---

## 🧮 Operations Supported

| Symbol | Operation         |
|--------|-------------------|
| `+`    | Addition           |
| `-`    | Subtraction        |
| `*`    | Multiplication     |
| `/`    | Division           |
| `%`    | Modulus (Remainder)|

---

## 🚀 How to Run

1. Make sure you have **Java 8 or higher** installed.
2. Save the file as `Main.java` in a directory named `com/lohithpuvvala/`.

```bash
.
└── com
    └── lohithpuvvala
        └── Main.java
````

3. Open a terminal, navigate to the project root, and compile the code:

```bash
javac com/lohithpuvvala/Main.java
```

4. Run the program:

```bash
java com.lohithpuvvala.Main
```
---

## 🛡️ Error Handling

* **Division/Modulus by Zero**: The program gracefully displays an error instead of crashing.
* **Invalid Operation Symbol**: Informs the user and skips result display.

---

## 📸 Example Output

```
--------------------------------------------------
|       Welcome to Java Console Calculator       |
--------------------------------------------------
Enter a number: 12.5
Enter another number: 3.5
Enter the Operation to Perform:
 + : Addition Operation
 - : Subtraction Operation
 * : Multiplication Operation
 / : Division Operation
 % : Modulus Operation
Choose any one option: +

Result: 12.500 + 3.500 = 16.000

To quit the program, enter 'q'. Press any other key to reload the calculator: 
```


---