package Example;

public class Employee extends Person {
    String address,position;
    int salary;

    Employee(String name, String gender, int age, String address, String position, int salary) {
        super(name, gender, age);
        this.address=address;
        this.position=position;
        this.salary=salary;
    }


    public void printEmpolyeeInfo(){
       System.out.println("Employee name : "+name
       +"\n gender : "+gender
       +"\n age : "+age
       +"\n address : "+address
       +"\n position : "+position
       +"\n Salary : "+salary);
    }
}
