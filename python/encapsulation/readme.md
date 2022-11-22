### Encapsulation
* It means wrapping data and the methods that work on data within one unit. This puts restrictions on accessing variables and methods directly and can prevent the accidental modification of data.
* There is 2 ways to achieve this in python:
  * protected members = cannot be accessed outside the class but can be accessed from within the class and its subclasses.it is customary(convention not a rule) to not access the protected out the class body.
  * private = Private members are similar to protected members, the difference is that the class members declared private should neither be accessed outside the class nor by any base class. 
    * if you want to access and update protected values you have to use getter and setter.

* Note: Python’s private and protected members can be accessed outside the class through python name **mangling**. 

### Resources
* [Encapsulation in python](https://www.geeksforgeeks.org/encapsulation-in-python/)