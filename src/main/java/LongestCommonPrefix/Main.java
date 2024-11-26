package LongestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        DataProcessor fl = new DataProcessor();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " +fl.longestCommonPrefix(strs));
    }
}
