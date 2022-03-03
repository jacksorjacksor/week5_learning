package w5e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HorseRace {
    public static void main(String[] args) {

        Map<Integer, Integer> allOutcomes = new HashMap<Integer, Integer>();

        // This works but still prints all IDs in order
        for (int i = 0; i < 10; i++) {
            HorseThread myLovelyHorse = new HorseThread(i);
            myLovelyHorse.run();
            Integer outcome = myLovelyHorse.getNumberOfSteps();
            System.out.println("Horse finished: number " + i + " in " + outcome + " steps!");
            allOutcomes.put(i, outcome);
        }

        // Get minimum steps
        ArrayList<Integer> outcomes = new ArrayList<Integer>(allOutcomes.values());
        Integer minimumSteps = Collections.min(outcomes);

        ArrayList<Integer> winningHorses = new ArrayList<Integer>();
        // Get winner
        for (var entry : allOutcomes.entrySet()) {
            if (entry.getValue() == minimumSteps) {
                winningHorses.add(entry.getKey());
            }
        }

        System.out.println("Winning horse: " + winningHorses + " in " + minimumSteps + " steps!!!");
    }
}
