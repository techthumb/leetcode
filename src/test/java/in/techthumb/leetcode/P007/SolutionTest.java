package in.techthumb.leetcode.P007;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


    @Test
    public void noopWithPositiveSingleDigitInput() {
        int input = (int) (Math.random() * 10);
        assertEquals(input, new Solution().reverse(input));
    }

    @Test
    public void noopWithNegativeSingleDigitInput() {
        int input = (int) (Math.random() * 10) * -1;
        assertEquals(input, new Solution().reverse(input));
    }

    @Test
    public void reversesWithPositiveInput() {
        assertEquals(321, new Solution().reverse(123));
    }

    @Test
    public void reversesWithNegativeInput() {
        assertEquals(-123, new Solution().reverse(-321));
    }

    @Test
    public void returnsZeroWhenPositiveOverflow() {
        assertEquals(0, new Solution().reverse(1000000003));
    }

    @Test
    public void returnsZeroWhenNegativeOverflow() {
        assertEquals(0, new Solution().reverse(-1000000003));
    }

}