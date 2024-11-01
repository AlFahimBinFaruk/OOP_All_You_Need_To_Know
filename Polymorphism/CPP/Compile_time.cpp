#include <iostream>

class Printer {
public:
    void print(int i) {
        std::cout << "Printing integer: " << i << std::endl;
    }

    void print(double d) {
        std::cout << "Printing double: " << d << std::endl;
    }

    void print(const std::string& s) {
        std::cout << "Printing string: " << s << std::endl;
    }
};

int main() {
    Printer printer;
    printer.print(10);             
    printer.print(3.14);           
    printer.print("Hello, World!");

    return 0;
}
