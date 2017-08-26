package in.techthumb.leetcode.P002;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        ListNode nodeOne = new ListNode(9);
        ListNode nodeTwo = new ListNode(9);
        ListNode totalNode = new Solution().addTwoNumbers(nodeOne, nodeTwo);
        assertEquals(totalNode.val, 8);
        assertEquals(totalNode.next.val, 1);
    }
}
