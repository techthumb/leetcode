package in.techthumb.leetcode.P009;

class Solution {
    boolean isPalindrome(int input) {
        if(input < 0) {
            return false;
        }
        int number = input;
        int reverse = 0;
        while (number > 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse == input;
    }
}
