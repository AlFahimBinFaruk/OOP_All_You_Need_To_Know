package StaticPolymorphism;

public class Example {
    Example(int age){
        System.out.println("Age is : "+age);
    }

    Example(String name,String gender){
        System.out.println("Name is : "+name+", gender : "+gender);
    }
}
