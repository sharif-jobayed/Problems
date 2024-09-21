package Java_Stdin_and_Stdout;

public class Main {
    static Solution solution = new Solution();

    public static void main(String[] args) {
        String myString = solution.scanner.next();
        System.out.println("The input was: " + myString);
        int myInteger = solution.scanner.nextInt();
        System.out.println("The number input was: " + myInteger);
        solution.scanner.close();
    }

}
