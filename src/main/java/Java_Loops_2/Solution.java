package Java_Loops_2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int queries = scanner.nextInt();

        // Iterate over each query
        for (int q = 0; q < queries; q++) {
            // Read the values of a, b, and n
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Initialize the series value with a
            int currentValue = a;

            // Build the series and print the results
            for (int i = 0; i < n; i++) {
                // Calculate the current term using the formula
                currentValue += (int) (Math.pow(2, i) * b);

                // Print the term with a space after it (except the last one)
                System.out.print(currentValue + " ");
            }
            // Print a new line after the series
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
