package leetcodechallenges.hashmapset.uniquenumberofoccurrences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occur = new HashMap<>();

        // Loop to put with the key value and its occurrences
        for (int num: arr){
            occur.put(num, occur.getOrDefault(num, 0) + 1);
        }

        // Create an array with unique values to make sure
        // every key have values different with each other
        List<Integer> uniqueValues = new ArrayList<>();
        for (int value : occur.values()) {
            if (!uniqueValues.contains(value)){
                uniqueValues.add(value);
            } else {
                return false;
            }

        }
        return true;
    }
}
