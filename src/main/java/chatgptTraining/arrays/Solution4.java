package chatgptTraining.arrays;

public class Solution4 {
    public int[] arr1 = new int[10];

    public void fillArray() {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 101);
        }
    }

    public void printArray() {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public void computeStats() {
        int min = arr1[0];
        int max = arr1[0];
        int sum = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
            if (arr1[i] > max) {
                max = arr1[i];
            }
            sum += arr1[i];
        }

        double average = (double) sum / arr1.length;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        solution4.fillArray();
        solution4.printArray();
        solution4.computeStats();
    }

}
