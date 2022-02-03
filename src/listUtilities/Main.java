package listUtilities;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(ListUtils.getMax(integerList));
        System.out.println(ListUtils.getMin(integerList));

    }
}
