package chatgptTraining.arrays;

public class Solution3 {
    public String[] swapFirstLast(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        String temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

        String[] arr1 = {"first", "middle", "last"};
        String[] arr2 = {"one", "two", "three", "four"};
        String[] arr3 = {"single"};

        arr1 = solution3.swapFirstLast(arr1);
        arr2 = solution3.swapFirstLast(arr2);
        arr3 = solution3.swapFirstLast(arr3);

        System.out.print("Modified arr1: ");
        for (String s : arr1) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print("Modified arr2: ");
        for (String s : arr2) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print("Modified arr3: ");
        for (String s : arr3) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
