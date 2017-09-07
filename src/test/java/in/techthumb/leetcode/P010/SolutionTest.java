package in.techthumb.leetcode.P010;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void handlesMatchingWithoutWildcards() {
        assertTrue(isMatch("a", "a"));
        assertTrue(isMatch("aa", "aa"));
        assertFalse(isMatch("aab", "aa"));
        assertFalse(isMatch("aa", "aab"));
    }

    @Test
    public void handlesMatchingWithSingleCharacterWildcards() {
        assertTrue(isMatch("a", "."));
        assertFalse(isMatch("a", "a."));
        assertTrue(isMatch("ab", "a."));
        assertTrue(isMatch("ab", ".b"));
        assertTrue(isMatch("abcd", "ab.d"));
    }


    @Test
    public void testWithAsteriskMatching() {
        assertTrue(isMatch("ab", "ab*"));
        assertTrue(isMatch("abb", "ab*"));
        assertTrue(isMatch("abbb", "ab*"));
        assertTrue(isMatch("aa", "a*"));
        assertFalse(isMatch("abcd", "d*"));
        assertTrue(isMatch("aa", "aab*"));
    }

    @Test
    public void testWithAsteriskAndDotCharacterMatching() {
        assertTrue(isMatch("xaabyc", "xa*b.c"));
    }

    private boolean isMatch(String string, String pattern) {
        return new Solution().isMatch(string, pattern);
    }

}