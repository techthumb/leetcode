package in.techthumb.leetcode.P013;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testUnits() {
        assertEquals(1, toInt("I"));
        assertEquals(2, toInt("II"));
        assertEquals(3, toInt("III"));
        assertEquals(4, toInt("IV"));
        assertEquals(5, toInt("V"));
        assertEquals(6, toInt("VI"));
        assertEquals(7, toInt("VII"));
        assertEquals(8, toInt("VIII"));
        assertEquals(9, toInt("IX"));
        assertEquals(10, toInt("X"));
    }

    @Test
    public void testTensUpToForty() {
        assertEquals(11, toInt("XI"));
        assertEquals(14, toInt("XIV"));
        assertEquals(15, toInt("XV"));
        assertEquals(20, toInt("XX"));
        assertEquals(24, toInt("XXIV"));
        assertEquals(25, toInt("XXV"));
        assertEquals(38, toInt("XXXVIII"));
    }

    @Test
    public void testRoundNumbersUpto() {
        assertEquals(10, toInt("X"));
        assertEquals(20, toInt("XX"));
        assertEquals(30, toInt("XXX"));
        assertEquals(40, toInt("XL"));
        assertEquals(50, toInt("L"));
        assertEquals(60, toInt("LX"));
        assertEquals(70, toInt("LXX"));
        assertEquals(80, toInt("LXXX"));
        assertEquals(90, toInt("XC"));
        assertEquals(100, toInt("C"));
        assertEquals(200, toInt("CC"));
        assertEquals(300, toInt("CCC"));
        assertEquals(500, toInt("D"));
        assertEquals(1000, toInt("M"));
        assertEquals(2000, toInt("MM"));
        assertEquals(3000, toInt("MMM"));
        assertEquals(3550, toInt("MMMDL"));
    }

    private int toInt(String string) {
        return new Solution().romanToInt(string);
    }

}