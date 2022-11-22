package Lambda_Java;

import java.util.ArrayList;

public class ExampleOne {
    public static void main(String[] args){
        ArrayList<String> myArr=new ArrayList<String>();

        myArr.add("Fahim");
        myArr.add("Mihaf");
        myArr.add("Suhan");

        // in here forEach is a method not a loop.
        myArr.forEach((n)->{
            System.out.println("Printing item => "+n);
        });
    }
}
