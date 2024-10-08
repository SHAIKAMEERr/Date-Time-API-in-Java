﻿# Date-Time-API-in-Java
# Java Date and Time Handling

In this repository, I have practiced various methods to handle date and time in Java. This README provides an overview of important concepts related to date and time in Java and explains the best practices for working with these concepts.

## Java Date and Time Basics

1. **Epoch Year and Epoch Time:**
   - In Java, the starting year of the date is called the **epoch year**, which begins from **1900**.
   - The starting time is known as **epoch time**, which begins from **1970**.

2. **currentTimeMillis() Method:**
   - The `currentTimeMillis()` method in Java returns the current time in milliseconds starting from the epoch time (1970).
   - The value returned by `currentTimeMillis()` is of type `long`.

   To convert milliseconds to other time units:
   - **Nanoseconds:** Divide by 1,000
   - **Seconds:** Divide by 1,000
   - **Minutes:** Divide by 60
   - **Hours:** Divide by 60
   - **Days:** Divide by 24
   - **Years:** Divide by 365 to find the difference in years from 1970 to the current date.
   - To get the current year, add **1970** to the year difference.

## Ways to Get Date and Time in Java

Java provides multiple classes to handle date and time:

1. **`java.util` package:**
   - Classes like `Calendar`, `GregorianCalendar`, `Date`, etc., can be used to work with dates and times.

2. **Best Practice:**
   - The recommended way to handle date and time in Java is to use the classes in the `java.time` package, introduced in Java 8:
     - `LocalDate` for date handling
     - `LocalTime` for time handling
     - `LocalDateTime` for both date and time

   These classes provide better handling of date and time, are immutable, and have more powerful methods for manipulating dates and times.

## What’s in This Repository?

In this repository, you will find code samples demonstrating the various methods and practices for getting and manipulating date and time in Java. This includes:

- Using legacy classes like `Calendar`, `Date`, and `GregorianCalendar`.
- Best practices using the `LocalDate`, `LocalTime`, and `LocalDateTime` classes.

## Conclusion

For modern Java development, always prefer using the `java.time` package classes (`LocalDate`, `LocalTime`, `LocalDateTime`, etc.) for handling date and time as they provide a more robust, flexible, and easy-to-use API.

Feel free to explore the code samples in this repository to deepen your understanding of date and time handling in Java.
