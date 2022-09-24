package AbstractionInterface.MultipleInterface;

public class Rahim implements MobileUser,ComputerUser{

    // sendIp() is available in both interfaces.
    @Override
    public void sendIp(){
        System.out.println("My Ip is 33.44.66");
    }

    @Override
    public void sendMsg(){
        System.out.println("Sending Message from mobile.");
    }

    @Override
    public void sendEmail(){
        System.out.println("Sending Email from computer.");
    }
}
