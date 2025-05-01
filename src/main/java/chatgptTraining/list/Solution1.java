package chatgptTraining.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public String[] arr1;
    public List<String> list1;

    public Solution1() {
        this.arr1 = new String[]{"first", "second", "middle", "fourth", "last"};
        this.list1 = new ArrayList<>(Arrays.asList(this.arr1));
    }


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        solution1.list1.add("END");
        solution1.arr1 = solution1.list1.toArray(new String[0]);

        System.out.println(Arrays.toString(solution1.arr1));
    }
}
