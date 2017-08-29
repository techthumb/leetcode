package in.techthumb.leetcode.P008;

public class Solution {
    int myAtoi(String input) {
        int index = 0;
        int sign = 1;
        int total = 0;

        if (input.length() == 0) {
            return 0;
        }
        while (input.charAt(index) == ' ' && index < input.length()) {
            index++;
        }

        if (input.charAt(index) == '+' || input.charAt(index) == '-') {
            sign = input.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (index < input.length()) {
            int digit = input.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;
            if (willOverflow(total, digit)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = 10 * total + digit;
            index++;
        }

        return total * sign;
    }

    static boolean willOverflow(int total, int digit) {
        int oneTenthOfMax = Integer.MAX_VALUE / 10;
        return total > oneTenthOfMax
                || oneTenthOfMax == total
                && digit > Integer.MAX_VALUE % 10;
    }
}
