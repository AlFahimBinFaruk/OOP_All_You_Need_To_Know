### What is Polymorphism?
* Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
  Inheritance lets us inherit attributes and methods from another class.
  Polymorphism uses those methods to perform different tasks.
  This allows us to perform a single action in different ways.

* Polymorphism is considered one of the important features of Object-Oriented Programming.
  Polymorphism allows us to perform a single action in different ways.
  In other words, polymorphism allows you to define one interface and have multiple implementations.
  The word “poly” means many and “morphs” means forms, So it means many forms.
* Polymorphism allows us to perform a **single action in different ways**.

* There are Two types of polymorphism.
    * **01.Static/Compile time** -> method,constructor **Overloading**.
    * **02.Dynamic/Run Time** -> method **Overriding**.

#### Compile-time polymorphism
* It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading.
  * Method Overloading: When there are multiple functions with the same name but different parameters then these functions are said to be overloaded. Functions can be overloaded by change in the number of arguments or/and a change in the type of arguments.
* **Note**: But Java doesn’t support the Operator Overloading.

#### Runtime polymorphism
* It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.
  *  **Method overriding** occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

### Overloading Methods:
* In Java, it is possible to define two or more methods within the same class that share the same name,
as long as their parameter declarations are different.
While overloaded methods may have different return types, the return type alone is insufficient to distinguish two
versions of a method. When Java encounters a call to an overloaded method, it simply executes the version of the method
whose parameters match the arguments used in the call.
In some cases, Java’s automatic type conversions can play a role in overload resolution.

```java
class OverloadDemo {
    void test(double a){
         System.out.println("Inside test(double) a: " + a);
    }
}


class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test(i);        // this will invoke test(double)
        ob.test(123.2);    // this will invoke test(double)
    }
}
```

* As you can see, this version of OverloadDemo does not define test(int). Therefore, when test( ) is called with an
integer argument inside Overload, no matching method is found. However, Java can automatically convert an integer
into a double, and this conversion can be used to resolve the call. Therefore, after test(int) is not found,
Java elevates i to double and then calls test(double).
Of course, if test(int) had been defined, it would have been called instead.
* Java will employ its automatic type conversions only if no exact match is found.

```java
class Helper {
 
    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }
 
    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}
 

class GFG {
    
    public static void main(String[] args)
    {
        // Calling method by passing
        // input as in arguments
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
    }
}

```



#### Overriding
* In a class hierarchy, when a method in a subclass has the same name and type signature as a method in its superclass,
then the method in the subclass is said to override the method in the superclass. When an overridden method is called
from within its subclass, it will always refer to the version of that method defined by the subclass. The version of the
method defined by the superclass will be hidden.

* Method overriding occurs only when the names and the type signatures of the two methods are identical.
If they are not, then the two methods are simply overloaded.

(Check display functions in box classes)

* [Dynamic Method Dispatch](https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/)

### Important resources.
* [Polymorphism is Java - GeeksForGeeks](https://www.geeksforgeeks.org/polymorphism-in-java/)
* [Java Polymorphism - w3schools](https://www.w3schools.com/java/java_polymorphism.asp)
* [Runtime VS Compile-time polymorphism](https://www.geeksforgeeks.org/difference-between-compile-time-and-run-time-polymorphism-in-java/)
* [Polymorphism in python](https://www.geeksforgeeks.org/polymorphism-in-python/)  
* [How to do method overloading in python](https://www.geeksforgeeks.org/python-method-overloading/)
