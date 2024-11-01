#include <iostream>
#include <string>

class BankAccount {
private:
    std::string accountHolderName; // Private attribute
    double balance;                 // Private attribute

public:
    // Constructor to initialize the bank account
    BankAccount(const std::string& name, double initialBalance) {
        accountHolderName = name;
        balance = initialBalance > 0 ? initialBalance : 0; // Ensure a non-negative balance
    }

    // Public method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            std::cout << "Deposited: $" << amount << "\n";
        } else {
            std::cout << "Deposit amount must be positive!\n";
        }
    }

    // Public method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            std::cout << "Withdrew: $" << amount << "\n";
        } else {
            std::cout << "Invalid withdrawal amount!\n";
        }
    }

    // Public method to get the current balance
    double getBalance() const {
        return balance;
    }

    // Public method to display account information
    void displayAccountInfo() const {
        std::cout << "Account Holder: " << accountHolderName << "\n";
        std::cout << "Current Balance: $" << balance << "\n";
    }
};

int main() {
    // Create a new bank account
    BankAccount account("John Doe", 1000.0);

    // Display initial account information
    account.displayAccountInfo();

    // Deposit money
    account.deposit(200.0);

    // Withdraw money
    account.withdraw(150.0);

    // Attempt to withdraw more than the balance
    account.withdraw(1200.0);

    // Display final account information
    account.displayAccountInfo();

    return 0;
}
