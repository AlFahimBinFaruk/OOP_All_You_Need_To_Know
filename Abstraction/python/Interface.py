from abc import ABC, abstractmethod

# Define the Animal interface
class Animal(ABC):
    # Define the abstract method
    @abstractmethod
    def speak(self):
        pass

# Dog class implementing the Animal interface
class Dog(Animal):
    def speak(self):
        return "Woof!"

# Cat class implementing the Animal interface
class Cat(Animal):
    def speak(self):
        return "Meow!"

# Usage example
def animal_sound(animal: Animal):
    print(animal.speak())

# Instantiate Dog and Cat
dog = Dog()
cat = Cat()

# Call the animal_sound function with Dog and Cat objects
animal_sound(dog)  # Outputs "Woof!"
animal_sound(cat)  # Outputs "Meow!"
