# Single Inheritance
class Person:
    def __init__(self, name, age) -> None:
        self.name = name
        self.age = age

    def displayInfo(self):
        print("Person name: ", self.name, "age: ", self.age)


class Employee(Person):
    def __init__(self, name, age, address, salary) -> None:
        super().__init__(name, age)
        self.address = address
        self.salary = salary

    def displayEmployeeInfo(self):
        super().displayInfo()
        print("address: ", self.address, "salary: ", self.salary)


personOne = Person("fahim", 33)
personOne.displayInfo()

employeeOne = Employee("suhan", 44, "BD", "33K")
employeeOne.displayEmployeeInfo()
