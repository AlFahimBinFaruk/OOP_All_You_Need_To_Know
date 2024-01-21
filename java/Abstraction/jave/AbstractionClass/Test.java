package AbstractionClass;

public class Test {
    public static void main(String[] args){

        /**
         * MobileUser is an abstract class,we cannot initiate it with "new keyword".
         * But we can use it as a "type reference" of myMobileUser variable.
         * */

        MobileUser myMobileUser;

        // Rahim
        myMobileUser =new Rahim();
        myMobileUser.sendMsg();

        // Karim
        myMobileUser=new Karim();
        myMobileUser.sendMsg();
    }
}
