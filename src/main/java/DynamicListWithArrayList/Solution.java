package DynamicListWithArrayList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> names_01;

    public Solution() {
        this.names_01 = new ArrayList<>(List.of());
    }

    public Solution addNames() {
        this.names_01.add("Imran");
        this.names_01.add("Wasim");
        this.names_01.add("Waqar");
        this.names_01.add("Saeed");
        this.names_01.add("Inzi");

        return this;
    }


    /*-------------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.addNames();
        solution.names_01.forEach(name -> {
            System.out.println("The name is: "+ name);
        });

        solution.names_01.add("Saqlain");
        System.out.println("The added spinner is: "+ solution.names_01.getLast());
    }
}
