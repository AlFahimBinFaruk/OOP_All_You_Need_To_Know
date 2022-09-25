`### Exception Handling.
* Exception Handling in Java is one of the effective means to handle the runtime errors ,
  so that the regular flow of the application can be preserved.Exceptions can be caught and handled by the program.

### Exception Hierarchy
* All exception and error types are subclasses of class Throwable, which is the base class of the hierarchy. 
  One branch is headed by Exception. This class is used for exceptional 
  conditions that user programs should catch.

### Exceptions can be categorized in two ways:
* Built-in Exceptions
  * Checked Exception : Checked exceptions are called compile-time exceptions 
    because these exceptions are checked at compile-time by the compiler.
    Types of checked exception:
    *  classNotFoundException.
    *  interruptedException.
    *  IOException.
    *  instantiationException.
    *  SQLException.
    *  fileNotFoundException.

  * Unchecked Exception : The unchecked exceptions are just opposite to the checked exceptions. 
    The compiler will not check these exceptions at compile time. In simple words, 
    if a program throws an unchecked exception, 
    and even if we didn’t handle or declare it, the program would not give a compilation error.
    Types of unchecked exception:
    * ArthmeticException.
    * ClassCastException.
    * NullPointerException.
    * ArrayINdexOutOfBoundsException.
    * ArrayStoreException.
    * IllegalThreadStateException.
  
* User-Defined Exceptions

### Exception is managed by 5 keywords.
* try.
* catch.
* finally.
* throw.
* throws.

### Important resources.
* <a href="https://www.youtube.com/watch?v=ucpUzdqDubs">Exception Handling - theory </a>
* <a href="https://www.youtube.com/watch?v=p4p5VujIkUo">Exception Handling - practical </a>
* <a href="https://www.geeksforgeeks.org/exceptions-in-java">Exceptions is Java</a>`