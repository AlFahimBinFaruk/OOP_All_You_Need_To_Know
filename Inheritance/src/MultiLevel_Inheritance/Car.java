package Inheritance.MultiLevelInheritance;

public class Car {
    String carName,model,color;
    int carPrice;

    public void setCarInfo(String carName,String model,String color,int carPrice){
        this.carName=carName;
        this.model=model;
        this.color=color;
        this.carPrice=carPrice;
    }

    //print car info.
    public void printCarInfo(){
        System.out.println("Car name => "+carName
                +", car model => "+model
                +", car color => "+color
                +", car carPrice => "+carPrice);
    }
}
