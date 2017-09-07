package in.techthumb.leetcode.P010;

import java.util.Arrays;

class Solution {
    boolean isMatch(String string, String pattern) {
        int rowCount = string.length() + 1;
        int columnCount = pattern.length() + 1;
        boolean[][] matrix = new boolean[rowCount][columnCount];
        matrix[0][0] = true;

        for (int column = 2; column < columnCount; column++) {
            if (pattern.charAt(column - 1) == '*') {
                matrix[0][column] = matrix[0][column - 2];
            }
        }

        for (int row = 1; row < rowCount; row++) {
            for (int column = 1; column < columnCount; column++) {
                char patternChar = pattern.charAt(column - 1);
                char stringChar = string.charAt(row - 1);
                if (stringChar == pattern.charAt(column - 1) || patternChar == '.') {
                    matrix[row][column] = matrix[row - 1][column - 1];
                } else if (patternChar == '*') {
                    matrix[row][column] = matrix[row][column - 2];
                    if (pattern.charAt(column - 2) == stringChar) {
                        matrix[row][column] = matrix[row][column] | matrix[row - 1][column];
                    }
                }
            }
        }

        return matrix[rowCount - 1][columnCount - 1];

    }


    private void print(boolean[][] matrix) {
        for (boolean[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}