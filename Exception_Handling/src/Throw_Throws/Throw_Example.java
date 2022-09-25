package Throw_Throws;

public class Throw_Example {
    static void checkAge(int age) {
        if (age < 18) {
            // throw custom error
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    // Driver method.
    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
    }
}
