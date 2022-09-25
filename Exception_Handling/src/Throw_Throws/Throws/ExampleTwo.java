package Throw_Throws.Throws;

public class ExampleTwo {
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("My error message");//this will show in catch block
    }

    // Driver method.
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main."+e);
        }
    }
}
