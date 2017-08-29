package in.techthumb.leetcode.P001;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void returnsIndicesWhenTargetExists() {
        assertArrayEquals(new int[]{1, 2}, new Solution().twoSum(new int[]{15, 2, 7, 11, 15}, 9));
    }

    @Test
    public void returnsIndicesWhenTargetExistsAndInputHasDuplicateValye() {
        assertArrayEquals(new int[]{2,3}, new Solution().twoSum(new int[]{1,2,3,3,4,5}, 6));
    }

    @Test
    public void returnsEmptyArrayWhenTargetDoesNotExist() {
        assertArrayEquals(new int[]{}, new Solution().twoSum(new int[]{15, 2, 7, 11, 15}, 10));
    }

}