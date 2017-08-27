package in.techthumb.leetcode.P005;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testWhenEntireStringIsAPalindrome() {
        String input = "abcdeffedcba";
        assertEquals(new Solution().longestPalindrome(input), input);
    }

    @Test
    public void testWhenSubStringIsAPalindrome() {
        assertEquals("abccba", new Solution().longestPalindrome("xyzabccbay"));
    }

    @Test
    public void testWhenSubStringDoesNotContainAPalindrome() {
        assertEquals("", new Solution().longestPalindrome("notpalindrome"));
    }

}
