package in.techthumb.leetcode.P003;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testWithUniqueString() {
        assertEquals(new Solution().lengthOfLongestSubstring("abcdefg"), 7);
    }

    @Test
    public void testWithEmptyString() {
        assertEquals(new Solution().lengthOfLongestSubstring(""), 0);
    }

    @Test
    public void testWithRepeatingCharacters() {
        assertEquals(new Solution().lengthOfLongestSubstring("abcbcacab"), 3);
    }

}
