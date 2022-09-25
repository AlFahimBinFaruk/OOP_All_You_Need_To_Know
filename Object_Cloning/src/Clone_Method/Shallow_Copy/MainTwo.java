package Clone_Method.Shallow_Copy;

import java.util.Arrays;

class MainTwoTest implements  Cloneable{
    int age;
    String name;
    int[] myArr=new int[4];

    MainTwoTest(int age,String name,int[] myArr){
        this.age=age;
        this.name=name;
        this.myArr=myArr;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MainTwo {
    public static void main(String[] args) throws CloneNotSupportedException {
        MainTwoTest obj=new MainTwoTest(33,"fahim", new int[]{33, 44, 55, 66});

        // print
        System.out.println("obj name : "+obj.name
        +", age : "+obj.age
        +", myArr : "+Arrays.toString(obj.myArr));

        // clone
        MainTwoTest objTwo=(MainTwoTest)obj.clone();
        // print
        System.out.println("objTwo name : "+objTwo.name
                +", age : "+objTwo.age
                +", myArr : "+Arrays.toString(objTwo.myArr));


        // after updating
        System.out.println("******** After updating ******");
        objTwo.name="Zayn";
        objTwo.age=55;
        objTwo.myArr[0]=1000;

        // obj
        System.out.println("obj name : "+obj.name
                +", age : "+obj.age
                +", myArr : "+Arrays.toString(obj.myArr));
        //objTwo
        System.out.println("objTwo name : "+objTwo.name
                +", age : "+objTwo.age
                +", myArr : "+Arrays.toString(objTwo.myArr));
    }
}
