package in.techthumb.leetcode.P015;

import java.util.*;

class Solution {

    List<List<Integer>> threeSum(int[] array) {
        List<List<Integer>> matchingElements = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value > 0) {
                break;
            }
            if (i > 0 && value == array[i - 1]) {
                continue;
            }
            int target = -value;
            int leftIndex = i + 1;
            int rightIndex = array.length - 1;
            while (leftIndex < rightIndex) {
                int leftValue = array[leftIndex];
                int rightValue = array[rightIndex];
                int sum = leftValue + rightValue;
                if (sum == target) {
                    matchingElements.add(Arrays.asList(value, leftValue, rightValue));
                    rightIndex--;
                    leftIndex++;
                    while (leftIndex < rightIndex && leftValue == array[leftIndex]) {
                        leftIndex++;
                    }
                    while (leftIndex < rightIndex && rightValue == array[rightIndex]) {
                        rightIndex--;
                    }
                } else if (sum > target) {
                    rightIndex--;
                } else {
                    leftIndex++;
                }
            }
        }
        return matchingElements;
    }

}
