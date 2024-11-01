package NumbersList;

import java.util.Arrays;
import java.util.List;

public class SmallestElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 15, 864, 68, 63584, 16, 4, 6354, 1);
        Integer smallestNumber = numbers.get(0);

        for (Integer number : numbers) {
            smallestNumber = number;
        }

        System.out.println("The smallest number is: " + smallestNumber);
    }
}
