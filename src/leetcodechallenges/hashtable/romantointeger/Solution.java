package leetcodechallenges.hashtable.romantointeger;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Queue<Integer> integerQueue = new LinkedList<>();
        for (char c : s.toCharArray()){
            switch (c){
                case 'I': integerQueue.add(1);
                case 'V': integerQueue.add(5);
                case 'X': integerQueue.add(10);
                case 'L': integerQueue.add(50);
                case 'C': integerQueue.add(100);
                case 'D': integerQueue.add(500);
                case 'M': integerQueue.add(1000);
            }
        }

        Integer[] integerArray = (Integer[]) integerQueue.toArray();

        for (int i = 0; i < integerArray.length; i++){
            if (integerArray[i + 1] > integerArray[i])
                return +=

        }

    }
}