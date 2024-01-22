package Enum_Constructor;

enum Test{
    Jan,Feb,Mar,April,May,June;

    // Constructor is not public or protected only Private or default
    // because we don't want to create new objects.
    Test(){
        // this will print every value in Test.
        System.out.println("Printing value = "+this);
    }

}

public class Main {
    public static void main(String[] args) {
        Test obj=Test.Jan;
    }
}
