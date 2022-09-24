package Example;

public class Test {
    public static void main(String[] args){
        Person myExample=new Person();

        //get name
        String myName=myExample.getMyName();
        System.out.println("My name => "+myName);

        //set new name
        myExample.setMyName("Suhan");
        //get new name
        /*****
        String myNewName=myExample.getMyName();
        System.out.println("My new name => "+myNewName);
        *****/
        System.out.println("My new name => "+myExample.getMyName());
    }
}
