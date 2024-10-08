package PalindromeCheck;

public class PalindromeCheck {
    public static void main(String[] args) {
        String text = "MadaM";
        String reverseText = new StringBuilder(text).reverse().toString();

        if (text.equals(reverseText)) {
            System.out.println("It's a Palindrome!");
        } else {
            System.out.println("It's not a Palindrome");
        }
    }
}
