package in.techthumb.leetcode.P001;

import java.util.HashMap;
import java.util.Map;

class Solution {
    int[] twoSum(int[] array, int target) {
        Map<Long, Integer> complements = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int complement = target - value;
            if (complements.containsKey((long) value)) {
                return new int[]{complements.get((long) value), i};
            }
            complements.put((long) complement, i);
        }
        return new int[0];
    }
}