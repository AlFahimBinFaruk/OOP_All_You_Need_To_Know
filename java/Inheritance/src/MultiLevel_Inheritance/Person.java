package Inheritance.MultiLevelInheritance;

public class Person extends Car {
    String name,gender;
    int age;

    public void setPersonInfo(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void printPersonInfo(){
        System.out.println("Person Name =>"+name+", gender => "+gender+", age => "+age);
    }
}
