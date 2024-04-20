# Java Factorial Calculator

## Overview

This Java program calculates the factorial of integers entered by the user. It includes error handling to deal with invalid input and a custom exception class for factorial-related exceptions.

## MainClass

- The `MainClass` contains the main method where users input integers to calculate their factorials.
- It utilizes a scanner object to receive user input and split the input string into individual integers.
- For each integer entered by the user, it attempts to calculate its factorial using the `FactorialCalculator` class.
- If the input is not a valid integer, a `NumberFormatException` is caught and an error message is displayed.
- If the input integer is outside the range [0, 15], a custom `FactorialException` is thrown and caught, displaying an appropriate error message.

## FactorialCalculator Class

- The `FactorialCalculator` class provides a static method `factorial` to calculate the factorial of an integer.
- It throws a `FactorialException` if the input integer is outside the valid range [0, 15].
- The `factorial` method implements the factorial calculation using a loop.
- If the input integer is 0 or 1, the method returns 1 without further computation.

## FactorialException Class

- The `FactorialException` class is a custom exception that extends the `Exception` class.
- It stores the invalid input number and provides a customized error message using the overridden `toString` method.

## Usage

1. **Running the Program**: Compile and run the `MainClass` to start the application.
2. **Input**: Enter integers separated by spaces to calculate their factorials.
3. **Output**: The program will display the factorial of each valid input integer. If an input is invalid, an error message will be shown.

## Requirements

- **Java Development Kit (JDK)**: Ensure you have JDK installed on your system to compile and run the Java program.



