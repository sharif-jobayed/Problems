package RemoveDuplicatesUsingHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private List<Integer> anIntegerList;

    public Solution(List<Integer> receivedIntegerList) {
        this.anIntegerList = receivedIntegerList;
    }

    public Solution removeDuplicates() {
        Set<Integer> aSet = new HashSet<>(this.anIntegerList);

        System.out.println("The items in the list are: " + aSet);
        return this;
    }

    /*-------------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 1, 5, 8, 68, 4, 6, 84, 8));

        Solution solution_01 = new Solution(integerList);

        solution_01.removeDuplicates();
    }
}
