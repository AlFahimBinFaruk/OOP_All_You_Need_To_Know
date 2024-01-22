package Basic;

public class BasicExample {
        enum Names{
            FAHIM,
            SUHAN,
            ZAYN
        }

        /**
         * Here enum name is = Names,
         * enum name is the type of enum.
         * Enum are Public Static Final
         * */
        public static void main(String[] args) {
            Names myNames=Names.FAHIM;
            System.out.println("Printing enum : "+myNames);

            // looping in enum
            for(Names n:Names.values()){
                System.out.println("Lopping enum : "+n);
            }
        }
}
