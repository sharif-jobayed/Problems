package Java_Stdin_and_Stdout_1;

import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String myString = scanner.next();
        System.out.println("The input was: " + myString);
        int myInteger = scanner.nextInt();
        System.out.println("The number input was: " + myInteger);
        scanner.close();
    }
}
