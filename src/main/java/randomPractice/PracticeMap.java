package randomPractice;

import java.util.HashMap;
import java.util.Map;

public class PracticeMap {
    private Map<Integer, String> aMutableMap;
    private Map<Integer, String> anImmutableMap;

    public PracticeMap() {
        this.aMutableMap = new HashMap<>(
                Map.of(
                        1, "Rajib",
                        2, "Riad",
                        3, "Tanvir"
                )
        );
        this.anImmutableMap = Map.of(
                1, "Rajib",
                2, "Riad",
                3, "Tanvir"
        );
    }

    public Map<Integer, String> getAMutableMap() {
        return this.aMutableMap;
    }

    public Map<Integer, String> getAnImmutableMap() {
        return this.anImmutableMap;
    }
}
