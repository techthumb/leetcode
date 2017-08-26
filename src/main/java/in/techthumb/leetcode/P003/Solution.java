package in.techthumb.leetcode.P003;

import java.util.HashMap;
import java.util.Map;

class Solution {
    int lengthOfLongestSubstring(String string) {
        Map<Character, Integer> existingLetters = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (existingLetters.containsKey(letter)) {
                j = Math.max(j, existingLetters.get(letter) + 1);
            }
            existingLetters.put(letter, i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}