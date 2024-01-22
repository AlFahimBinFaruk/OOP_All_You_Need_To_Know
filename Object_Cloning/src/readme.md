### Object Cloning.
* Object cloning refers to the creation of an exact copy of an object. It creates a new instance of the class of the current object and initializes all its fields with exactly the contents of the corresponding fields of this object.
* In Shallow Copy: new copies are only created for **String** and **Primitive data** types.For data types like **object**,**array** or other container like data type it will not create new copy it will always point to / use the previous one.
  * means if you are coping an object type and that object itself contains an another object type then that second object type will not be copied only the variables of first object type will be copied.

#### Using Assignment Operator to create a copy of the reference variable
* In Java, there is no operator to create a copy of an object. Unlike C++, in Java, if we use the assignment operator then it will create a copy of the reference variable and not the object.
* See = **Assignment_Operator** code

#### Creating a copy(shallow copy) using the clone() method
* The class whose object’s copy is to be made must have a public clone method in it or in one of its parent class.  
  * Every class that implements clone() should call super.clone() to obtain the cloned object reference.
  * The class must also implement java.lang.Cloneable interface whose object clone we want to create otherwise it will throw CloneNotSupportedException when clone method is called on that class’s object.
  * * **Please Note** – clone() method does create a completely new object with a different hashCode value, which means its in a separate memory location. But due to the Test object c being inside Test2, the primitive types have achieved deep copy but this Test object c is still shared between t1 and t2. To overcome that we explicitly do a deep copy for object variable c, which is discussed later.
```bash
// A Java program to demonstrate
    // shallow copy using clone()
    import java.util.ArrayList;

// An object reference of this class is
// contained by Test2
class Test {
  int x, y;
}

// Contains a reference of Test and
// implements clone with shallow copy.
class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

// Driver class
public class Main {
    public static void main(String args[])
    throws CloneNotSupportedException {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;
        
        Test2 t2 = (Test2)t1.clone();
         
        // Creating a copy of object t1
        // and passing it to t2
        t2.a = 100;
         
        // Change in primitive type of t2 will
        // not be reflected in t1 field
        t2.c.x = 300;
         
        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
                                   + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x
                                   + " " + t2.c.y);
        }
}
```
  * In the above example, t1.clone returns the shallow copy of the object t1. To obtain a deep copy of the object certain modifications have to be made in the clone method after obtaining the copy.
  * See = **Basic_Example** and **Shallow_Copy** for code more explained.

#### Usage of clone() method – Deep Copy 
* If we want to create a deep copy of object X and place it in a new object Y then a new copy of any referenced objects fields are created and these references are placed in object Y. This means any changes made in referenced object fields in object X or Y will be reflected only in that object and not in the other. In the below example, we create a deep copy of the object.
* A deep copy copies all fields and makes copies of dynamically allocated memory pointed to by the fields. A deep copy occurs when an object is copied along with the objects to which it refers.
```bash
// A Java program to demonstrate
// deep copy using clone()
 
// An object reference of this
// class is contained by Test2
class Test {
    int x, y;
}
 
// Contains a reference of Test and
// implements clone with deep copy.
class Test2 implements Cloneable {
    int a, b;
 
    Test c = new Test();
 
    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to
        // new reference variable t
        Test2 t = (Test2)super.clone();
 
        // Creating a deep copy for c
        t.c = new Test();
        t.c.x = c.x;
        t.c.y = c.y;
 
        // Create a new object for the field c
        // and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }
}
 
public class Main {
    public static void main(String args[])
        throws CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;
 
        Test2 t3 = (Test2)t1.clone();
        t3.a = 100;
 
        // Change in primitive type of t2 will
        // not be reflected in t1 field
        t3.c.x = 300;
 
        // Change in object type field of t2 will
        // not be reflected in t1(deep copy)
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
                           + " " + t1.c.y);
        System.out.println(t3.a + " " + t3.b + " " + t3.c.x
                           + " " + t3.c.y);
    }
} 
```
  * In the above example, we can see that a new object for the Test class has been assigned to copy an object that will be returned to the clone method. Due to this t3 will obtain a deep copy of the object t1. So any changes made in ‘c’ object fields by t3, will not be reflected in t1.
  * see = **Deep_Copy** for more explained code example

### Deep Copy vs Shallow Copy
* Shallow copy is the method of copying an object and is followed by default in cloning. In this method, the fields of an old object X are copied to the new object Y. While copying the object type field the reference is copied to Y i.e object Y will point to the same location as pointed out by X. If the field value is a primitive type it copies the value of the primitive type.
* Therefore, any changes made in referenced objects in object X or Y will be reflected in other objects.
* Shallow copies are cheap and simple to make.

### Advantages of clone method:
* If we use the assignment operator to assign an object reference to another reference variable then it will point to the same address location of the old object and no new copy of the object will be created. Due to this any changes in the reference variable will be reflected in the original object.
* If we use a copy constructor, then we have to copy all the data over explicitly i.e. we have to reassign all the fields of the class in the constructor explicitly. But in the clone method, this work of creating a new copy is done by the method itself. So to avoid extra processing we use object cloning.

### Resources
* [Object Cloning in Java - geeks for geeks](https://www.geeksforgeeks.org/clone-method-in-java-2/)
* [Object Cloning Deep,Shallow,Assignment - the conceptual](https://www.youtube.com/watch?v=ubeWjzVnrw0)
* [Deep Copy - the conceptual](https://www.youtube.com/watch?v=HAduu0CXv1k)
* [Shallow copy - the conceptual](https://www.youtube.com/watch?v=iVK-kMSGD3w)