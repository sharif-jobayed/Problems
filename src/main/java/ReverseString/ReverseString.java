package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        String text = "Hello";
        String reverseString = new StringBuilder(text).reverse().toString();
        System.out.println("The reverse String is: " + reverseString);
    }
}
