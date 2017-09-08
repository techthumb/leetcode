package in.techthumb.leetcode.P014;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testLongestCommonPrefixWithOneElement() {
        assertEquals("abc", new Solution().longestCommonPrefix(new String[]{"abc"}));
    }

    @Test
    public void testLongestCommonPrefixWithEmptyStrings() {
        assertEquals("", new Solution().longestCommonPrefix(new String[]{""}));
    }

    @Test
    public void testLongestCommonPrefixWithEmptyInput() {
        assertEquals("", new Solution().longestCommonPrefix(new String[0]));
    }

    @Test
    public void testLongestCommonPrefixWithMultipleElements() {
        assertEquals("abc", new Solution().longestCommonPrefix(new String[]{"abcqwertyu", "abc", "abc", "abcde"}));
    }

    @Test
    public void testLongestCommonPrefixWithMultipleElementsAndNoMatchingPrefix() {
        assertEquals("", new Solution().longestCommonPrefix(new String[]{"abc", "def", "ghi"}));
    }

}