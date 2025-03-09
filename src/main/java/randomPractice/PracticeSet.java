package randomPractice;

import java.util.HashSet;
import java.util.Set;

public class PracticeSet {
    private Set<Integer> aMutableSet;
    private Set<Integer> anImmutableSet;

    public PracticeSet() {
        this.aMutableSet = new HashSet<>(Set.of(0, 1, 2));
        this.anImmutableSet = Set.of(0, 1, 2);
    }

    public Set<Integer> getaMutableSet() {
        return this.aMutableSet;
    }

    public Set<Integer> getAnImmutableSet() {
        return this.anImmutableSet;
    }
}
