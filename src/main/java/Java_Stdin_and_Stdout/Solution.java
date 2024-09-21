package Java_Stdin_and_Stdout;

import java.util.Scanner;

public class Solution {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution solution = new Solution();

        String myString = solution.scanner.next();
        System.out.println("The input was: " + myString);
        int myInteger = solution.scanner.nextInt();
        System.out.println("The number input was: " + myInteger);
        solution.scanner.close();
    }
}
