### Enums in Java.
* An enum is a special **class** that represents a group of **constants** (unchangeable variables, like final variables).
* Enum is short for **enumerations**, which means **specifically listed**.
* To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
Note that enum values  should be in uppercase letters:**see Basic.BasicExample.java**

#### Enum inside a Class
* You can also have an enum inside a class:**see Basic.BasicExample.java**

#### Enum in a Switch Statement
* Enums are often used in switch statements to check for corresponding values:**see Basic.SwitchCase_Enum.java**

#### Loop Through an Enum
* The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:**see Basic.BasicExample.java**

### Difference between Enums and Classes
* An enum can, just like a class, have **attributes** and **methods**. The only difference is that enum constants are **public**, **static** and **final** (unchangeable - cannot be overridden).
* An enum cannot be used to create objects, and it cannot extend other classes (but it can **implement interfaces**).

### Why And When To Use Enums?
* Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.


### Resources
* [Enums in Java - w3Schools](https://www.w3schools.com/java/java_enums.asp)
* [Enums in Java - the conceptual](https://www.youtube.com/watch?v=8PuIYnE_YwE)