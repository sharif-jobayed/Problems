package SumOfNumbersInTheList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static void sum(List<Integer> intList) {
        Integer total = 0;

        for (int i = 0; i < intList.size(); i++) {
            Integer currentTotal = total += intList.get(i);
            System.out.println("Current total is: " + currentTotal);
        }

        System.out.println("The sum of the numbers is: " + total);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        sum(intList);
    }
}
