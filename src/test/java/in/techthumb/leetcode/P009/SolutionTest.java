package in.techthumb.leetcode.P009;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void returnsTrueForPositivePalindromeNumbers() {
        assertTrue(new Solution().isPalindrome(121));
    }

    @Test
    public void returnsFalseForPositiveNonPalindromeNumbers() {
        assertFalse(new Solution().isPalindrome(123));
    }

    @Test
    public void returnsFalseForNegativePalindromeNumbers() {
        assertFalse(new Solution().isPalindrome(-121));
    }

    @Test
    public void returnsFalseForNegativeNonPalindromeNumbers() {
        assertFalse(new Solution().isPalindrome(-123));
    }

    @Test
    public void handlesNegativeIntegerOverflow() {
        assertTrue(new Solution().isPalindrome(2147447412));
    }

}