#include <iostream>

// Define the Animal interface
class Animal {
public:
    // Pure virtual function for speaking
    virtual void speak() const = 0;

    // Virtual destructor for proper cleanup
    virtual ~Animal() = default;
};

// Dog class implementing the Animal interface
class Dog : public Animal {
public:
    void speak() const override {
        std::cout << "Woof!" << std::endl;
    }
};

// Cat class implementing the Animal interface
class Cat : public Animal {
public:
    void speak() const override {
        std::cout << "Meow!" << std::endl;
    }
};

int main() {
    // Create Dog and Cat objects
    Dog myDog;
    Cat myCat;

    // Call speak method on each animal
    myDog.speak(); // Outputs "Woof!"
    myCat.speak(); // Outputs "Meow!"

    return 0;
}
