package LargestElement;

import java.util.Arrays;
import java.util.List;

public class SmallestElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 15, 864, 68, 63584, 16, 4, 6354, 1);
        Integer smallestNumber = numbers.getFirst();

        for(int i = 0; i < numbers.size(); i++) {
            smallestNumber = numbers.get(i);
        }

        System.out.println("The smallest number is: "+smallestNumber);
    }
}
