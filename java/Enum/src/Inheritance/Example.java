package Inheritance;

enum Test implements TestInf{

    Jan,Feb,Mar,April,May,June;

    @Override
    public void printName() {
        System.out.println("MY name is fahim");
    }
}

public class Example {
    public static void main(String[] args) {
        Test obj;
        obj=Test.Feb;

        System.out.println("Value of obj : "+obj);

        obj.printName();
    }

}
