package in.techthumb.leetcode.P008;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void emptyStringReturnsZero() {
        assertEquals(0, new Solution().myAtoi(""));
    }

    @Test
    public void numericInput() {
        assertEquals(42, new Solution().myAtoi("    42   "));
    }

    @Test
    public void negativeNumericInput() {
        assertEquals(-42, new Solution().myAtoi("   -42    "));
    }


    @Test
    public void positiveNumericInputWithHyphen() {
        assertEquals(0, new Solution().myAtoi("   +-2  "));
    }

    @Test
    public void alphaNumericInputReturnMinusOne() {
        assertEquals(0, new Solution().myAtoi("  A42B "));
    }

    @Test
    public void negativeAlphaNumericInputReturnMinusOne() {
        assertEquals(-42, new Solution().myAtoi("  -42AB "));
    }

    @Test
    public void willOverflow() {
        int oneTenthOfMax = Integer.MAX_VALUE / 10;
        assertFalse(Solution.willOverflow(oneTenthOfMax, 0));
        assertFalse(Solution.willOverflow(oneTenthOfMax, 1));
        assertFalse(Solution.willOverflow(oneTenthOfMax, 2));
        assertFalse(Solution.willOverflow(oneTenthOfMax, 3));
        assertFalse(Solution.willOverflow(oneTenthOfMax, 4));
        assertFalse(Solution.willOverflow(oneTenthOfMax, 5));
        assertFalse(Solution.willOverflow(oneTenthOfMax, 6));
        assertFalse(Solution.willOverflow(oneTenthOfMax, 7));
        assertTrue(Solution.willOverflow(oneTenthOfMax, 8));
        assertTrue(Solution.willOverflow(oneTenthOfMax, 9));
    }
}