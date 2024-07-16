package src.gfg.sortingtutorial.easy;

import java.util.*;

public class SortElementsByFrequency {

    public static void main(String[] args) {

        int[] array = new int[]{2, 4, 3, 2, 1, 2, 3, 4, 5, 3, 3, 6, 6, 5, 2, 7};
        HashMap<Integer, Integer> valueFreqPairs = new HashMap<>();

        // constructing a map of value and its frequency in the array
        for (int num : array) {
            valueFreqPairs.put(num, valueFreqPairs.getOrDefault(num, 0) + 1); //avoids NPE (case: null+1)
        }

        // Sorting by frequencies in DESC Order
        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<>(valueFreqPairs.entrySet());

        // implement custom comparator to sort based on values(=frequencies) in DESC order
        Collections.sort(list, new FrequencyComparator());

        //display the result
        for (Map.Entry<Integer, Integer> x : list) {
            int frequency = x.getValue().intValue();
            while (frequency-- > 0) {
                System.out.print(x.getKey().intValue() + ", ");
            }
        }
    }
}

class FrequencyComparator implements Comparator<Map.Entry<Integer, Integer>> {

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if (o1.getValue() > o2.getValue())
            return -1;
        else if (o1.getValue() < o2.getValue())
            return 1;

        return 0;
    }
}
