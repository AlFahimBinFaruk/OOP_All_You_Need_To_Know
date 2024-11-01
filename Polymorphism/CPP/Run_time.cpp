#include <iostream>

// Base class
class Shape {
public:
    virtual void draw() const { // Virtual function
        std::cout << "Drawing Shape\n";
    }

    virtual ~Shape() = default; // Virtual destructor
};

// Derived class 1
class Circle : public Shape {
public:
    void draw() const override { // Override the base class method
        std::cout << "Drawing Circle\n";
    }
};

// Derived class 2
class Square : public Shape {
public:
    void draw() const override { // Override the base class method
        std::cout << "Drawing Square\n";
    }
};

int main() {
    Shape* shape1 = new Circle(); // Base class pointer pointing to derived class
    Shape* shape2 = new Square(); // Base class pointer pointing to derived class

    shape1->draw(); // Calls Circle's draw
    shape2->draw(); // Calls Square's draw

    delete shape1; // Clean up
    delete shape2; // Clean up

    return 0;
}
