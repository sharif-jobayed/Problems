package Manual_Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static ArrayList<Integer> sortedNumbers = new ArrayList<>();

    static void getSortedNumbers() {
        Scanner receivedInteger = new Scanner(System.in);

        // Receive numbers multiple times
        for(int i = 0; i < 5; i++) {
            Integer n = receivedInteger.nextInt();

            // Find the correct position to insert the number
            int insertPosition = 0;
            while (insertPosition < sortedNumbers.size() && sortedNumbers.get(insertPosition) < n) {
                insertPosition++;
            }

            // Insert the number at the correct position
            sortedNumbers.add(insertPosition, n);
        }

    }

    public static void main(String[] args) {
        getSortedNumbers();
        System.out.println("The sorted numbers are: "+sortedNumbers);
    }
}
