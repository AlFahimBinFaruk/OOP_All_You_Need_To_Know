package Lambda_Java;

/**
 * to see the explanation of this program watch : https://www.youtube.com/watch?v=H6ehwVzAmVc
 * **/

// defining what we mean by type StringFunction in printFormatted.
interface StringFunction {
    // this abstract function(function without body) will return string
    String run(String str);
}

public class ExampleThree {
    //Create a method which takes a lambda expression as a parameter
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    // Driver method
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

}
