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
    
    # over-riding(dynamic)
    def displayInfo(self):
        print("Personal info cannot be displayed")

    def displayName(self):
        print("Employee Name",self.name)    



personOne = Person("fahim", 33)
personOne.displayInfo()

employeeOne = Employee("suhan", 44, "BD", "33K")
employeeOne.displayInfo()
employeeOne.displayName()


