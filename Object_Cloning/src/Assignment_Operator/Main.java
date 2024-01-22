package Assignment_Operator;

public class Main {
    public static void main(String[] args) {
        Test obj=new Test(44,55);
        System.out.println("Original obj a : "+ obj.a
                            +", b : "+ obj.b);

        // coping obj using assignment operator
        Test objTwo=obj;


        System.out.println("Copied objTwo a : "+ objTwo.a
                +", b : "+ objTwo.b);


        System.out.println("***** After updating objTwo *****");

        // Any change made in objTwo will be reflected in obj
        objTwo.a = 100;

        System.out.println("Updated Original obj a : "+ obj.a
                +", b : "+ obj.b);
        System.out.println("Updated copied objTwo a : "+ obj.a
                +", b : "+ obj.b);
    }
}
