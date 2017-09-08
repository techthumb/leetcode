package in.techthumb.leetcode.P012;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testUnits() {
        assertEquals("I", toRoman(1));
        assertEquals("II", toRoman(2));
        assertEquals("III", toRoman(3));
        assertEquals("IV", toRoman(4));
        assertEquals("V", toRoman(5));
        assertEquals("VI", toRoman(6));
        assertEquals("VII", toRoman(7));
        assertEquals("VIII", toRoman(8));
        assertEquals("IX", toRoman(9));
        assertEquals("X", toRoman(10));
    }

    @Test
    public void testTensUpToForty() {
        assertEquals("XI", toRoman(11));
        assertEquals("XIV", toRoman(14));
        assertEquals("XV", toRoman(15));
        assertEquals("XX", toRoman(20));
        assertEquals("XXIV", toRoman(24));
        assertEquals("XXV", toRoman(25));
        assertEquals("XXXVIII", toRoman(38));
    }

    @Test
    public void testRoundNumbersUpto() {
        assertEquals("X", toRoman(10));
        assertEquals("XX", toRoman(20));
        assertEquals("XXX", toRoman(30));
        assertEquals("XL", toRoman(40));
        assertEquals("L", toRoman(50));
        assertEquals("LX", toRoman(60));
        assertEquals("LXX", toRoman(70));
        assertEquals("LXXX", toRoman(80));
        assertEquals("XC", toRoman(90));
        assertEquals("C", toRoman(100));
        assertEquals("CC", toRoman(200));
        assertEquals("CCC", toRoman(300));
        assertEquals("D", toRoman(500));
        assertEquals("M", toRoman(1000));
        assertEquals("MM", toRoman(2000));
        assertEquals("MMM", toRoman(3000));
        assertEquals("MMMDL", toRoman(3550));
    }

    private String toRoman(int integer) {
        return new Solution().intToRoman(integer);
    }
}