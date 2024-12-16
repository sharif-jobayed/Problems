package FindIndexFromString;

public class Solution {
    public static Character getCharacter(String text, int word, int index) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println("Input text cannot be null or empty.");
            return null;
        }
        try {
            // Split the input string into words
            String[] words = text.split(" ");

            // Check if the word index is within bounds
            if (word < 0 || word >= words.length) {
                System.out.println("Word index " + word + " is out of range. Total words: " + words.length);
                return null;
            }

            // Check if the character index is within bounds for the selected word
            if (index < 0 || index >= words[word].length()) {
                System.out.println("Character index " + index + " is out of range for the word: \"" + words[word] + "\"");
                return null;
            }

            // Get the requested character
            Character askedCharacter = words[word].charAt(index);
            System.out.println("The Character at index " + index + " from Word " + word + " is: " + askedCharacter);
            return askedCharacter;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid word or character index. Please check your input.");
            return null;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Character index is out of bounds for the given word.");
            return null;
        }
    }

    /*-------------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        String text_0001 = "We are clarifying the Epic entity that you are signing the EULA with based on where you live.";

        // Example: Valid case
        getCharacter(text_0001, 0, 2);

        // Example: Word index out of range
        getCharacter(text_0001, 20, 0);

        // Example: Character index out of range
        getCharacter(text_0001, 2, 10);

        // Example: Null or empty string
        getCharacter("", 0, 2);
        getCharacter(null, 0, 2);
    }
}
