### Encapsulation.
* Encapsulation is defined as the wrapping up of data under a single unit.
  It is the mechanism that binds together code and the data it manipulates.
  Another way to think about encapsulation is, that it is a protective shield that
  prevents the data from being accessed by the code outside this shield.

#### Encapsulation is a process of :
* Packing **variables** and **methods** in a single unit.
* Protecting data by declaring them as **private**.
* **Private members can only be used inside the same class**.
* **Normally we only declare variable/attributes and methods as private**.Classes are not declared as private(if you declare a class private you cannot extend it or create obj with it).

#### Encapsulation can be achieved by:
* Declaring all the variables in the class as **private** and
  writing public methods in the class to set and get the values of variables **(getter and setter)**.

### Advantages of Encapsulation:
* **Data Hiding:** it is a way of restricting the access of our data members by hiding the implementation details.
  Encapsulation also provides a way for data hiding. The user will have no idea about the inner implementation of the
  class. It will not be visible to the user how the class is storing values in the variables.
  The user will only know that we are passing the values to a setter method and variables are
  getting initialized with that value.

* **Increased Flexibility:** We can make the variables of the class read-only or write-only depending on our requirement.
  If we wish to make the variables read-only then we have to omit the setter methods like setName(), setAge(), etc.
  from the above program or if we wish to make the variables write-only then we have to omit the get methods like
  getName(), getAge(), etc. from the above program

* **Reusability:** Encapsulation also improves the re-usability and is easy to change with new requirements.

* **Testing code is easy:** Encapsulated code is easy to test for unit testing.

### Important resources.
* [Java Encapsulation - w3Schools](https://www.w3schools.com/java/java_encapsulation.asp)
* [Java Encapsulation - geeks for geeks](https://www.geeksforgeeks.org/encapsulation-in-java/)