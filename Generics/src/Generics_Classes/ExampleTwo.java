package Generics_Classes;

class TestTwo<T,U>{
    T valOne;
    U valTwo;

    TestTwo(T valOne,U valTwo){
        this.valOne=valOne;
        this.valTwo=valTwo;
    }

    public void printObj(){
        System.out.println("Val One : "+valOne+", val two : "+valTwo);
    }
}

public class ExampleTwo {
    public static void main(String[] args) {
        // Type of integer,String
        TestTwo<Integer,String> objOne=new TestTwo<Integer,String>(33,"Fahim");
        System.out.println("Type of Integer,String : ");
        objOne.printObj();

        // Type of boolean,float
        TestTwo<Boolean,Float> objTwo=new TestTwo<Boolean,Float>(false,33.3f);
        System.out.println("Type of Boolean,Float : ");
        objTwo.printObj();
    }
}

