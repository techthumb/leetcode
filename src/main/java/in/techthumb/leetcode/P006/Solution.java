package in.techthumb.leetcode.P006;

class Solution {
    enum Direction {
        UP,
        DOWN
    }

    String convert(String string, int numRows) {
        if (numRows == 1) {
            return string;
        }
        char[][] matrix = new char[numRows][string.length()];

        int row = 0;
        int column = 0;
        int index = 0;
        Direction direction = Direction.DOWN;
        while (index < string.length()) {
            matrix[row][column] = string.charAt(index);
            if (row == 0) {
                direction = Direction.DOWN;
                column++;
            }

            if (row == numRows - 1) {
                direction = Direction.UP;
                column++;
            }

            if (Direction.DOWN.equals(direction)) {
                row++;
            } else {
                row--;
            }
            index++;
        }

        for (char[] r : matrix) {
            for (char cell : r) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char[] r : matrix) {
            for (char cell : r) {
                if (cell != '\u0000') {
                    stringBuilder.append(cell);
                }
            }
        }

        return stringBuilder.toString();
    }

}