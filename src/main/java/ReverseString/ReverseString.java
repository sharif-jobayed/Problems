package ReverseString;

public class ReverseString {
    private final StringBuilder REVERSED;

    public ReverseString() {
        this.REVERSED = new StringBuilder();
    }

    public void method_01(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            this.REVERSED.append(text.charAt(i));
        }
    }

    public void method_02(String text) {
        new StringBuilder(text).reverse();
    }



    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();

        String text = "Hello";

        reverseString.method_01(text);
        System.out.println("The reverse String is: " + reverseString.REVERSED);

        reverseString.method_02(text);
        System.out.println("The reverse String is: " + reverseString.REVERSED);
    }
}
