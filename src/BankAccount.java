/*
 * Encapsulation in Java
Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) principles in Java,
 alongside Abstraction, Inheritance, and Polymorphism. Encapsulation refers to the 
 practice of bundling data (variables) and methods that operate on that data into a single unit, 
 usually a class, while restricting direct access to the internal representation of the object.

Key Concepts of Encapsulation:
Data Hiding → Prevent direct access to class fields by declaring them private.

Access Control → Provide controlled access to fields using getter and setter methods.

Improved Maintainability → Encapsulation makes the code modular, easier to modify, and maintain.

Increased Security → Prevent unintended modifications to fields.


 */


// Encapsulated class
public class BankAccount {
    private double balance; // Private variable

    // Getter method to get balance
    public double getBalance() {
        return balance;
    }

    // Setter method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Setter method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }
}
