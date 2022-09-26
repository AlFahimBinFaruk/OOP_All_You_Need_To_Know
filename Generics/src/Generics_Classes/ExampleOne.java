package Generics_Classes;

//Example One : with single Type Parameters.

class Test<T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }

    public T getObj(){
        return  this.obj;
    }
}

public class ExampleOne {
    public static void main(String[] args) {
        // Type of integer
        Test<Integer> objOne=new Test<Integer>(33);
        System.out.println("Type of Integer : "+objOne.getObj());

        // Type of String
        Test<String> objTwo=new Test<String>("Fahim");
        System.out.println("Type of String : "+objTwo.getObj());
    }
}
