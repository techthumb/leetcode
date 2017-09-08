package in.techthumb.leetcode.P011;

class Solution {
    int maxArea(int[] heights) {
        int maxArea = -1;
        int leftIndex = 0;
        int rightIndex = heights.length - 1;

        while (leftIndex < rightIndex) {
            int leftHeight = heights[leftIndex];
            int rightHeight = heights[rightIndex];
            int height = Math.min(leftHeight, rightHeight);
            int width = rightIndex - leftIndex;
            int currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);
            if (leftHeight > rightHeight) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        return maxArea;
    }

}
