package AbstractionInterface.BasicExmaple;

public class Rahim implements PcUser {
    /**
     * 01.we have to use "implements" keyword to inherit an interface in class.
     * 02.In interface every method is public by default so, you have to declare public before printInfo()
     * */
    @Override
    public void printInfo(){
        System.out.println("I am Rahim.");
    }

    @Override
    public void sendIp(){
        System.out.println("IP Address is 123.44.44");
    }
}
