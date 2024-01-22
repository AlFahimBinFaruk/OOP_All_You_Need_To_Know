package AbstractionClass;

//if you want to use abstract method you have to declare the parent class abstract.
//abstract class cannot be initiated,they can only be inherited/extended or use as a type reference.
//abstract class can have both abstract and non-abstract methods.
//only methods and class can be abstracted.

public abstract class MobileUser {
    //Java abstract class can have class members like private, protected, etc.
    //abstract method can't have "final","static","private" data type,but it can have "public" data type,you can also not declare any data type then it will be default data type.
    public abstract void sendMsg();//abstract method don't have a body.The body will be declared in the subclass
}
