package randomPractice;

import java.util.ArrayList;
import java.util.List;

public class PracticeList {
    private List<Integer> aMutableList;
    private List<Integer> anImmutableList;

    public PracticeList() {
        this.aMutableList = new ArrayList<>(List.of(10, 41, 82));
        this.anImmutableList = List.of(10, 41, 82);
    }

    public List<Integer> getaMutableList() {
        return this.aMutableList;
    }

    public List<Integer> getAnImmutableList() {
        return this.anImmutableList;
    }
}
