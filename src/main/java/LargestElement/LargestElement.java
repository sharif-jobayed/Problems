package LargestElement;

import java.util.Arrays;
import java.util.List;

public class LargestElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 15, 864, 68, 63584, 16, 4, 6354, 1);
        Integer largetNumber = 0;

        for(int i = 0; i < numbers.size(); i++) {
            if(largetNumber < numbers.get(i)) {
                largetNumber = numbers.get(i);
            }
        }

        System.out.println("The largest number is: "+largetNumber);
    }
}
