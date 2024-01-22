package Clone_Method.Basic_Example;

public class Test implements Cloneable{
    String name,gender;
    int age;

    Test(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
