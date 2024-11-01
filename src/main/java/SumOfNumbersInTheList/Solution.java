package SumOfNumbersInTheList;

public class Solution {
//    private static void sum(List<Integer> intList) {
//        Integer total = 0;
//
//        for (int i = 0; i < intList.size(); i++) {
//            Integer currentTotal = total += intList.get(i);
//            System.out.println("Current total is: " + currentTotal);
//        }
//
//        System.out.println("The sum of the numbers is: " + total);
//    }

    private static void sumInteger(Integer myInteger) {
        int total = 0;
        String intToStr = myInteger.toString();

        for (int i = 0; i < intToStr.length(); i++) {
            int strToInt = Character.getNumericValue(intToStr.charAt(i));
            total += strToInt;
        }

        System.out.println("The total of the given integer is: " + total);
    }

    public static void main(String[] args) {
//        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        sum(intList);
        Integer myInteger = 1234;
        sumInteger(myInteger);
    }
}
