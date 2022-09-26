package Generics_Functions;

public class ExampleOne {
    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println("Type : "+element.getClass().getName()
                + " and value : " + element);
    }

    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
