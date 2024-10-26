package NumbersList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortElementsBothWay {
    static void smallestToLargest(List<Integer> list) {
        Collections.sort(list);
    }

    static void largestToSmallest(List<Integer> list) {
        list.sort(Collections.reverseOrder());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 15, 864, 68, 63584, 16, 4, 6354, 1);

        smallestToLargest(numbers);
        System.out.println("The sorted elements are: "+numbers);

        largestToSmallest(numbers);
        System.out.println("The reverse sorted elements are: "+numbers);
    }
}
