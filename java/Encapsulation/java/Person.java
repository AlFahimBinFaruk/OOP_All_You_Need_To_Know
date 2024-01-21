package Example;

public class Person {

    // Read : https://www.geeksforgeeks.org/encapsulation-in-java/
    // Watch : https://www.youtube.com/watch?v=hpRcmfNnwu, https://www.youtube.com/watch?v=5zanUOGTzk8


    /******
     * Encapsulation is a process of :
     * 01. Packing "variables" and "methods" in a single unit.
     * 02. Protecting data by declaring them as "private".
     * 03. Private members can only be used inside the same class.
     * *****/

    /*****
     * Encapsulation can be achieved by:
     * Declaring all the variables in the class as private and
     * writing public methods in the class to set and get the values of variables.
     * ****/

    private String myName="Fahim";

    //get my name
    public String getMyName(){
        return myName;
    }

    //set my name
    public void setMyName(String name){
        myName=name;
    }

}
