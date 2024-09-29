package Java_Stdin_and_Stdout_2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the integer
        int i = scan.nextInt();

        // Read the double
        double d = scan.nextDouble();

        // Consume the leftover newline before reading the String
        scan.nextLine();

        // Read the String
        String s = scan.nextLine();

        // Print the output as per the required format
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
