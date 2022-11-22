package Clone_Method.Basic_Example;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test objOne=new Test("Fahim","Male",33);

        // print
        System.out.println("ObjOne name : "+objOne.name
        +", gender : "+objOne.gender
        +", age : "+objOne.age);

        // clone to objTwo using clone()
        Test objTwo=(Test)objOne.clone();

        // print
        System.out.println("objTwo name : "+objTwo.name
                +", gender : "+objTwo.gender
                +", age : "+objTwo.age);

        // updating
        System.out.println("****** After Updating objTwo ******");

        objTwo.name="Suhan";
        objTwo.age=44;

        // print objOne
        System.out.println("ObjOne name : "+objOne.name
                +", gender : "+objOne.gender
                +", age : "+objOne.age);
        // print objTwo
        System.out.println("objTwo name : "+objTwo.name
                +", gender : "+objTwo.gender
                +", age : "+objTwo.age);
    }
}
