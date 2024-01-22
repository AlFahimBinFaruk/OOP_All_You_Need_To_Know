package Lambda_Java;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ExampleTwo {
    public static void main(String[] args){
        ArrayList<String> myArr=new ArrayList<String>();

        myArr.add("Fahim");
        myArr.add("Mihaf");
        myArr.add("Suhan");

        //Use Java's Consumer interface to store a lambda expression in a variable:
        Consumer<String> method=(n)->{
            System.out.println("Printing my item => "+n);
        };

        myArr.forEach(method);
    }
}
