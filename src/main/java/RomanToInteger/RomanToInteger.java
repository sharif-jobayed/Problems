package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private Map<Character, Integer> romanMap;
    private int result;

    public RomanToInteger() {
        this.romanMap = new HashMap<>();
        this.romanMap.put('I', 1);
        this.romanMap.put('V', 5);
        this.romanMap.put('X', 10);
        this.romanMap.put('L', 50);
        this.romanMap.put('C', 100);
        this.romanMap.put('D', 500);
        this.romanMap.put('M', 1000);
    }

    public int convert(String s) {
        this.result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));

            if (i < s.length() - 1 && current < romanMap.get(s.charAt(i + 1))) {
                this.result -= current;
            } else {
                this.result += current;
            }
        }

        return result;
    }
}
