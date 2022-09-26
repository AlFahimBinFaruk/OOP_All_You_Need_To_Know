import java.util.Arrays;
import java.util.List;

public class Lower_Bounded {
    /** In Lower bound we define the Minimum type of arg **/
    // here arg can be Integer of Superclass of Integer (Which is Number).
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }

    public static void main(String[] args)
    {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);

        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }
}
