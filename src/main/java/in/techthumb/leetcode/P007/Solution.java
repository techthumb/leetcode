package in.techthumb.leetcode.P007;

public class Solution {
    int reverse(int input) {
        int reversed = 0;
        int sign = input < 0 ? -1 : 1;
        input *= sign;
        while (input > 0) {
            int remainder = input % 10;
            input /= 10;
            if (willOverflow(reversed, remainder)) {
                return 0;
            } else {
                reversed = reversed * 10 + remainder;
            }
        }
        return reversed * sign;
    }

    boolean willOverflow(int reversed, int remainder) {
        if (reversed > Integer.MAX_VALUE / 10) {
            return true;
        } else if (reversed == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < remainder) {
            return true;
        }
        return false;
    }
}
