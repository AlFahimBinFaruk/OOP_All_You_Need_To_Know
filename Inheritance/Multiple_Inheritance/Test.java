package Inheritance.MultipleInheritance;

interface one {
    public void print_geek();
}

interface two {
    public void print_for();
}

interface three extends one, two {
    public void print_geek();
}
class child implements three {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

// Driver class
public class Test {
    public static void main(String[] args)
    {
        /*
        ** Multiple Inheritance (Through Interfaces): In Multiple inheritances,
        *  one class can have more than one superclass and inherit features from all parent classes.
        *  Please note that Java does not support multiple inheritances with classes.
        *  n java, we can achieve multiple inheritances only through Interfaces.
        * */

        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}