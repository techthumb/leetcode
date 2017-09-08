package in.techthumb.leetcode.P014;

import java.util.Arrays;

class Solution {
    private char NULL_CHARACTER = '\u0000';

    String longestCommonPrefix(String[] strings) {
        if(strings.length == 0) {
            return "";
        }
        char[] commonPrefix = strings[0].toCharArray();
        int commonPrefixLength = commonPrefix.length;

        for (String string : strings) {
            char[] chars = string.toCharArray();
            commonPrefixLength = Math.min(commonPrefixLength, chars.length);

            for (int i = 0; i < commonPrefixLength; i++) {
                char prefixElement = commonPrefix[i];
                char stringElement = chars[i];
                if (prefixElement != stringElement) {
                    commonPrefix[i] = NULL_CHARACTER;
                    commonPrefixLength = i;
                }
            }
        }

        return new String(Arrays.copyOfRange(commonPrefix, 0, commonPrefixLength));

    }
}
