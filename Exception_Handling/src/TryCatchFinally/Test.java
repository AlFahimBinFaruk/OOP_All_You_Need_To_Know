package TryCatchFinally;

public class Test {
    public static void main(String[] args){
        /**
         * 01.finally block is optional.it will always execute whether there is any error or no-error.
         * 02."Exception" holds all exception type it is used when you don't know the exception type.
         * 03."Exception" always have to be the last catch block if you use it.
         * 04.You can find all kinds of exception type in readme.md
         * **/

        // try-catch-finally block exception handling example:
        try{
            int a=33;
            int b=0;
            int result =a/b;
            System.out.println("Result is => "+result);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception => "+e);
        }catch(Exception e2){
            // Exception holds all the exception types.
            System.out.println("Exception Type => "+e2);
        }finally {
            // finally block will always execute whether there is any error or no-error.
            System.out.println("Finally do this.");
        }
    }
}
