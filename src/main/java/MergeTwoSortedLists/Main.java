package MergeTwoSortedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));

        solution.mergeTwoLists(list1, list2);
        System.out.println(solution.mergeTwoLists(list1, list2));
    }
}
