package SimpleArrayOperations;

public class Solution {
    int[] intArray_01;

    public Solution() {
        this.intArray_01 = new int[]{1, 2, 3, 4};
    }

    public int sumOfValues() {
        int total = 0;
        for(int i = 0; i < this.intArray_01.length; i++) {
            total += this.intArray_01[i];
        }
        System.out.println("The total of the values is: "+total);
        return total;
    }
    /*-------------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.sumOfValues();
    }
}
