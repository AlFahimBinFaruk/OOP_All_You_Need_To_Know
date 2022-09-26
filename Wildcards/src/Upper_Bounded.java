import java.util.Arrays;
import java.util.List;

public class Upper_Bounded {
    /** In upper bound we define the Maximum type of arg **/
    // here arg will be Number of Subclass of Number (which are Integer and Double).
    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args)
    {

        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));

        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list2));

        // Number list
        List<Number> list3 = Arrays.asList(4, 5, 6, 7);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list3));
    }
}
