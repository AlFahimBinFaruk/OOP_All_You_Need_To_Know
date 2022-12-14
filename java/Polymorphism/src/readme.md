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

```bash
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

```bash
Returning Objects:

// Returning an object.
class Test {
    int a;
    
    Test(int i) {
        a = i;
    }
    
    Test incrByTen() {
        Test temp = new Test(a+10);
        return temp;
    }
}


class RetOb {
    public static void main(String args[]) {
        Test ob1 = new Test(2);
        Test ob2;
        ob2 = ob1.incrByTen();
        
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
    }
}

Output:
ob1.a: 2
ob2.a: 12
```


* As you can see, each time incrByTen( ) is invoked, a new object is created, and a reference to it is returned to the
calling routine. Since all objects are dynamically allocated using new, you don’t need to worry about an object going
out-of-scope because the method in which it was created terminates. The object will continue to exist as long as there
is a reference to it somewhere in your program. When there are no references to it, the object will be reclaimed the
next time garbage collection takes place.

#### Overriding
* In a class hierarchy, when a method in a subclass has the same name and type signature as a method in its superclass,
then the method in the subclass is said to override the method in the superclass. When an overridden method is called
from within its subclass, it will always refer to the version of that method defined by the subclass. The version of the
method defined by the superclass will be hidden.

* Method overriding occurs only when the names and the type signatures of the two methods are identical.
If they are not, then the two methods are simply overloaded.

(Check display functions in box classes)

* Dynamic Method Dispatch:
  * Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than
    compile time. Dynamic method dispatch is important because this is how Java implements run-time polymorphism.
    Let’s begin by restating an important principle: a superclass reference variable can refer to a subclass object.
    When an overridden method is called through a superclass reference, Java determines which version of that method to
    execute based upon the type of the object being referred to at the time the call occurs. Thus, this determination is
    made at run time.
    In other words, it is the type of the object being referred to (not the type of the reference variable)
    that determines which version of an overridden method will be executed.

* If B extends A then you can override a method in A through B with changing the return type of method to B.

### Important resources.
* [Polymorphism is Java - GeeksForGeeks](https://www.geeksforgeeks.org/polymorphism-in-java/)
* [Java Polymorphism - w3schools](https://www.w3schools.com/java/java_polymorphism.asp)
