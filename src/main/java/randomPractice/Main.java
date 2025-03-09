package randomPractice;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // PracticeList
        PracticeList practiceList = new PracticeList();
        System.out.println("aMutableList is: " + practiceList.getaMutableList());
        System.out.println("anImmutableList is: " + practiceList.getAnImmutableList());

        practiceList.getaMutableList().addAll(List.of(3, 4, 5));
        System.out.println("After adding 3 4 5, the value of aMutableList now is: " + practiceList.getaMutableList());

//        practiceList.getAnImmutableList().addAll(List.of(3,4,5));
//        System.out.println("anImmutableArrayList now is: "+practiceList.getAnImmutableList());

        /*------------------------------------------------------------------------*/

    }
}
