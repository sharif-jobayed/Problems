package chatgptTraining;

import java.util.Arrays;

public class Solution1 {
    public int[] arr1 = {98, 461, 61, 5, 84, 614, 1};
    public int[] arr2 = new int[10];

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        System.out.println("Stock arr1 is: " + Arrays.toString(solution1.arr1));
        solution1.reverse(solution1.arr1);
        System.out.println("Reversed arr1 is: " + Arrays.toString(solution1.arr1));

        for (int i = 0; i < solution1.arr2.length; i++) {
            solution1.arr2[i] = i;
        }

        System.out.println("arr2 with values is: " + Arrays.toString(solution1.arr2));
        solution1.reverse(solution1.arr2);
        System.out.println("Reversed arr2 is: " + Arrays.toString(solution1.arr2));
    }
}
