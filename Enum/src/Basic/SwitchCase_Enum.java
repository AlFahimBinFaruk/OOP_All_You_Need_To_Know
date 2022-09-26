package Basic;

enum Level{
    LOW,
    MEDIUM,
    HIGH;
    int MYMETOD(){
        return 3;
    }
}

public class SwitchCase_Enum {
        public static void main(String[] args) {
            Level myVar = Level.MEDIUM;
            //print my method value
            System.out.println("My method value : "+myVar.MYMETOD());
            switch(myVar) {
                case LOW:
                    System.out.println("Low level");
                    break;
                case MEDIUM:
                    System.out.println("Medium level");
                    break;
                case HIGH:
                    System.out.println("High level");
                    break;
            }


        }
}
