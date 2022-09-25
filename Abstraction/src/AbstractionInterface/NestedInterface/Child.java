package AbstractionInterface.NestedInterface;

public class Child implements Person.PersonInfo{

    @Override
    public void printPersonInfo(String name, int age, String address) {
        System.out.println("Name : "+name+", age : "+age+", address : "+address);
    }
}
