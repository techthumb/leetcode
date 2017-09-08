package in.techthumb.leetcode.P013;

import java.util.HashMap;
import java.util.Map;

class Solution {
    int romanToInt(String input) {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("I", 1);
        mapping.put("IV", 4);
        mapping.put("V", 5);
        mapping.put("IX", 9);
        mapping.put("X", 10);
        mapping.put("XL", 40);
        mapping.put("L", 50);
        mapping.put("XC", 90);
        mapping.put("C", 100);
        mapping.put("CD", 400);
        mapping.put("D", 500);
        mapping.put("CM", 900);
        mapping.put("M", 1000);

        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1 && mapping.containsKey(input.substring(i, i + 2))) {
                total += mapping.get(input.substring(i, i + 2));
                i++;
            } else {
                total += mapping.get(input.substring(i, i + 1));
            }
        }
        return total;
    }

}
