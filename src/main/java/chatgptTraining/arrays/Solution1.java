package chatgptTraining.arrays;

import java.util.Arrays;

public class Solution1 {
    public int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public int[] arr2 = new int[10];

    public int[] revert1(int[] arr) {
        int[] tempArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[arr.length - 1 - i];
            tempArr[arr.length - 1 - i] = arr[i];
        }
        return tempArr;
    }


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        System.out.println("Stock arr1 is: " + Arrays.toString(solution1.arr1));
        int[] revertArr1 = solution1.revert1(solution1.arr1);
        System.out.println("Reversed arr1 is: " + Arrays.toString(revertArr1));

        for (int i = 0; i < solution1.arr2.length; i++) {
            solution1.arr2[i] = i;
        }
        System.out.println("The array2 is: " + Arrays.toString(solution1.arr2));
        int[] revertArr2 = solution1.revert1(solution1.arr2);
        System.out.println("The reversed array2 is: " + Arrays.toString(revertArr2));
    }
}
