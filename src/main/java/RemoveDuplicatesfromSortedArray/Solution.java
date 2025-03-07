package RemoveDuplicatesfromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        Solution solution = new Solution();
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }
}
