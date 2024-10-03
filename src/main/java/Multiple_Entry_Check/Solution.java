package Multiple_Entry_Check;

import java.util.HashSet;

public class Solution {
    public static boolean hasDuplicates(Integer... args) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i : args) {
            if(numbers.contains(i)) {
                return true;
            }
            numbers.add(i);
        }
        return false;
    }

    public static void main(String... args) {
        boolean hasDuplicates = hasDuplicates(5, 7, 8, 10, 18, 8, 11, 5, 8, 0);
        if (hasDuplicates) {
            System.out.println("Duplicates found.");
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
