package Inheritance.MultiLevelInheritance;

public class Test {
    public static void main(String[] args){
       /*
        Car
           |
        Person
           |
        Employee

        ** Person extends car.
        ** Employee extends Person.
        ** That means Employee has features of both Person and Car
        ** Multilevel Inheritance: In Multilevel Inheritance, a derived class will be inheriting a base class
           and as well as the derived class also act as the base class to other class.
        */

        Employee myEmployee=new Employee();

        //set info
        myEmployee.setPersonInfo("Fahim","Male",33);
        myEmployee.setEmployeeInfo("Java","BD",3366);
        myEmployee.setCarInfo("Toyota","3mlle3","Black",33);

        //print info
        myEmployee.printPersonInfo();
        myEmployee.printEmployeeInfo();
        myEmployee.printCarInfo();
    }
}
