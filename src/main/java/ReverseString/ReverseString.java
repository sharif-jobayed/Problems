package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        String text = "Hello";
        StringBuilder reversed = new StringBuilder();
//        String reverseString = new StringBuilder(text).reverse().toString();
//        System.out.println("The reverse String is: " + reverseString);

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        System.out.println("The reverse String is: " + reversed);
    }
}
