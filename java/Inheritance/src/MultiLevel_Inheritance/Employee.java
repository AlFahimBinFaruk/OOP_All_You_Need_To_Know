package Inheritance.MultiLevelInheritance;

public class Employee extends Person {
    String language,address;
    int salary;

    public void setEmployeeInfo(String language,String address,int salary){
        this.language=language;
        this.address=address;
        this.salary=salary;
    }

    public void printEmployeeInfo(){
        System.out.println("Employee Language =>"+language+", address => "+address+", salary => "+salary);
    }
}
