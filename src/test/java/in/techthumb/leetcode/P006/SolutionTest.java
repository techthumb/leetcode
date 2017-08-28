package in.techthumb.leetcode.P006;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample() {
        assertEquals("PAHNAPLSIIGYIR", new Solution().convert("PAYPALISHIRING", 3));
    }

    @Test
    public void testSingleRowReturnsStringWithoutModifications() {
        assertEquals("PAYPALISHIRING", new Solution().convert("PAYPALISHIRING", 1));
    }

    @Test
    public void testEdgeCase() {
        assertEquals("ACB", new Solution().convert("ABC", 2));
    }

}