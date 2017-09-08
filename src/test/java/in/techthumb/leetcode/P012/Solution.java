package in.techthumb.leetcode.P012;

class Solution {

    String intToRoman(int input) {
        String[] THOUSANDS = new String[]{"", "M", "MM", "MMM"};
        String[] HUNDREDS = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] TENS = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ONES = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder romanNumeral = new StringBuilder();
        romanNumeral.append(THOUSANDS[input / 1000]);
        input %= 1000;
        romanNumeral.append(HUNDREDS[input / 100]);
        input %= 100;
        romanNumeral.append(TENS[input / 10]);
        input %= 10;
        romanNumeral.append(ONES[input]);
        return romanNumeral.toString();
    }
}
