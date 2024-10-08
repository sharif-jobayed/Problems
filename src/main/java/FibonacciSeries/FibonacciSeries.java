package FibonacciSeries;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 0; i < 10; i++) {
            int next = a+b;
            System.out.println("Current Fibonacci is: "+next);
            a = b;
            b = next;
        }
    }
}
