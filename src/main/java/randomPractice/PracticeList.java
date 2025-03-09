package randomPractice;

import java.util.ArrayList;
import java.util.List;

public class PracticeList {
    private List<Integer> aMutableList;
    private List<Integer> anImmutableList;

    public PracticeList() {
        this.aMutableList = new ArrayList<>(List.of(0, 1, 2));
        this.anImmutableList = List.of(0, 1, 2);
    }

    public List<Integer> getaMutableList() {
        return this.aMutableList;
    }

    public List<Integer> getAnImmutableList() {
        return this.anImmutableList;
    }

}
