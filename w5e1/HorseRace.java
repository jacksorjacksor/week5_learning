package w5e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HorseRace {
    public static void main(String[] args) {

        Map<Integer, Integer> allOutcomes = new HashMap<Integer, Integer>();
        // Um this is totally wrong and needs to be first horse to 1k. Unsure how I
        // misread that!
        for (int i = 0; i < 10; i++) {
            HorseThread myLovelyHorse = new HorseThread(i);
            myLovelyHorse.run();
            Integer outcome = myLovelyHorse.getPosition();
            allOutcomes.put(i, outcome);
        }

        // Get highest value
        ArrayList<Integer> outcomes = new ArrayList<Integer>(allOutcomes.values());
        Integer furthestDistance = Collections.max(outcomes);

        ArrayList<Integer> winningHorses = new ArrayList<Integer>();
        // Get winner
        for (var entry : allOutcomes.entrySet()) {
            if (entry.getValue() == furthestDistance) {
                winningHorses.add(entry.getKey());
            }
        }
        System.out.println("Winning horses: " + winningHorses.toString());

    }
}
