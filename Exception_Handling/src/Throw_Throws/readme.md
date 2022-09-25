### Throw and Throws in Java
* The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom exceptions.
* The flow of execution of the program stops immediately after the throw statement is executed and the nearest enclosing try block is checked to see if it has a catch statement that matches the type of exception. If it finds a match, controlled is transferred to that statement otherwise next enclosing try block is checked and so on. If no matching catch is found then the default exception handler will halt the program.

#### Throws Described
* Throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block.
* In a program, if there is a chance of raising an exception then compiler always warn us about it and compulsorily we should handle that checked exception, Otherwise we will get compile time error saying unreported exception XXX must be caught or declared to be thrown. To prevent this compile time error we can handle the exception in two ways:
  * By using try catch
  * By using throws keyword
  We can use throws keyword to delegate the responsibility of exception handling to the caller (It may be a method or JVM) then caller method is responsible to handle that exception.

#### Important points to remember about throws keyword:
* throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless.
* throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program.
* By the help of throws keyword we can provide information to the caller of the method about the exception.

### Exception List in Java
* Throwable 
  * Exception 
    * CloneNotSupportedException 
      * InterruptedException 
      * ReflectiveOperationException 
        * ClassNotFoundException 
        * IllegalAccessException 
        * InstantiationException 
        * NoSuchFieldException 
        * NoSuchMethodException 
    * RuntimeException
      * ArithmeticException
      * ArrayStoreException
      * ClassCastException
      * EnumConstantNotPresentException
        * IllegalArgumentException
        * IllegalThreadStateException
    * NumberFormatException
    * IllegalCallerException 9
    * IllegalMonitorStateException
    * IllegalStateException
    * IndexOutOfBoundsException
      * ArrayIndexOutOfBoundsException
      * StringIndexOutOfBoundsException
    * LayerInstantiationException 9
    * NegativeArraySizeException
    * NullPointerException
    * SecurityException
    * TypeNotPresentException
    * UnsupportedOperationException

### Important resources
* [Throw-Throws in Java - geeks for geeks](https://www.geeksforgeeks.org/throw-throws-java/)
* [List of Java Exceptions and Errors - programming guide](https://programming.guide/java/list-of-java-exceptions.html)
* [Throws explained - the conceptual](https://www.youtube.com/watch?v=S-N0UtCkzF0)