### Upcasting
* This type of initialization is used to access only the members present in the parent class and the methods which are overridden in the child class. This is because the parent class is upcasted to the child class.
* https://www.geeksforgeeks.org/upcasting-in-java-with-examples/
```java
public class Demo{

    public void tt(String x){
        System.out.println(x);
    }
}


public class DemoChild extends Demo{

    @Override
    public void tt(String x){
        System.out.println("My name is " +x);
    }
}


public class Test {

    public static void main(String args[]){
          Demo d=new DemoChild();
          d.tt("fahim");
    }
}
```