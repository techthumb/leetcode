package in.techthumb.leetcode.P005;

class Solution {
    String longestPalindrome(String string) {
        int start = 0, end = 0;
        for (int i = 0; i < string.length(); i++) {
            int oddPalindromeLength = palindromeLengthWithCenterAt(string, i, i);
            int evenPalindromeLength = palindromeLengthWithCenterAt(string, i, i + 1);
            int palindromeLength = Math.max(oddPalindromeLength, evenPalindromeLength);
            if (palindromeLength > end - start) {
                start = i - (palindromeLength - 1) / 2;
                end = i + palindromeLength / 2;
            }
        }
        if (start == end) {
            return "";
        }
        return string.substring(start, end + 1);
    }

    private int palindromeLengthWithCenterAt(String string, int left, int right) {
        while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}