package chatgptTraining.arrays;

public class Solution2 {
    public int[] arr1 = {98, 461, 61, 5, 84, 614, 1};

    public int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println("Sum of arr1 is: " + solution2.sum(solution2.arr1));
    }
}
