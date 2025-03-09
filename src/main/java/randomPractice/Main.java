package randomPractice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");

        // PracticeList
        PracticeList practiceList = new PracticeList();
        System.out.println("aMutableList is: " + practiceList.getaMutableList());
        System.out.println("anImmutableList is: " + practiceList.getAnImmutableList());

        practiceList.getaMutableList().addAll(List.of(3, 4, 5));
        System.out.println("After adding 3 4 5, the value of aMutableList now is: " + practiceList.getaMutableList());

//        practiceList.getAnImmutableList().addAll(List.of(3,4,5));
//        System.out.println("anImmutableArrayList now is: "+practiceList.getAnImmutableList());

        System.out.println("---------------------------------------------------");

        // PracticeMap
        PracticeMap practiceMap = new PracticeMap();
        System.out.println("aMutableMap is: " + practiceMap.getAMutableMap());
        System.out.println("anImmutableMap is: " + practiceMap.getAnImmutableMap());

        practiceMap.getAMutableMap().put(4, "Inaya");
        System.out.println("aMutableMap now is: " + practiceMap.getAMutableMap());

//        practiceMap.getAnImmutableMap().put(4, "Inaya");
//        System.out.println("anImmutableMap now is: "+ practiceMap.getAnImmutableMap());

        System.out.println("---------------------------------------------------");

        // PracticeSet
        PracticeSet practiceSet = new PracticeSet();
        System.out.println("aMutableSet is: " + practiceSet.getaMutableSet());
        System.out.println("anImmutableSet is: " + practiceSet.getAnImmutableSet());

        practiceSet.getaMutableSet().add(3);
        System.out.println("aMutableSet now is: " + practiceSet.getaMutableSet());

//        practiceSet.getAnImmutableSet().add(3);
//        System.out.println("anImmutableSet now is: "+ practiceSet.getAnImmutableSet());

        System.out.println("---------------------------------------------------");

    }
}
