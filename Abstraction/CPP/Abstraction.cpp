#include <iostream>
#include <cmath>

// Abstract class representing a generic Shape
class Shape {
public:
    // Pure virtual function for calculating area
    virtual double area() const = 0;

    // Pure virtual function for calculating perimeter
    virtual double perimeter() const = 0;

    // Virtual destructor
    virtual ~Shape() = default;
};

// Circle class derived from Shape
class Circle : public Shape {
private:
    double radius;

public:
    Circle(double r) : radius(r) {}

    // Implement area calculation for Circle
    double area() const override {
        return 3.14159 * radius * radius;
    }

    // Implement perimeter calculation for Circle
    double perimeter() const override {
        return 2 * 3.14159 * radius;
    }
};

// Rectangle class derived from Shape
class Rectangle : public Shape {
private:
    double width, height;

public:
    Rectangle(double w, double h) : width(w), height(h) {}

    // Implement area calculation for Rectangle
    double area() const override {
        return width * height;
    }

    // Implement perimeter calculation for Rectangle
    double perimeter() const override {
        return 2 * (width + height);
    }
};

int main() {
    // Using pointers to Shape to abstract away the specific types
    Shape* shapes[2];
    shapes[0] = new Circle(5.0);
    shapes[1] = new Rectangle(4.0, 6.0);

    // Iterate over the shapes and print area and perimeter
    for (int i = 0; i < 2; ++i) {
        std::cout << "Shape " << i + 1 << " area: " << shapes[i]->area() << std::endl;
        std::cout << "Shape " << i + 1 << " perimeter: " << shapes[i]->perimeter() << std::endl;
    }

    // Clean up
    delete shapes[0];
    delete shapes[1];

    return 0;
}
