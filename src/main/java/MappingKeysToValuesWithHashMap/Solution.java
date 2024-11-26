package MappingKeysToValuesWithHashMap;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, String> players;

    public Solution() {
        this.players = new HashMap<>();
    }

    public Solution setPlayers() {
        this.players.put(1, "Imran");
        this.players.put(2, "Wasim");
        this.players.put(3, "Waqar");
        this.players.put(4, "Saeed");
        this.players.put(5, "Saqlain");

        return this;
    }
    /*-------------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.setPlayers();
        System.out.println("The current players are: "+solution.players);

        solution.players.put(1, "Javed");
        System.out.println("The current players are: "+solution.players);

        solution.players.put(6, "Inzi");
        System.out.println("The current players are: "+solution.players);

        System.out.println("The man of the match is: "+solution.players.get(4));

        String injured = solution.players.remove(5);
        System.out.println("The injured player is: "+injured);
    }
}
