package in.techthumb.leetcode.P021;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testMergeWithoutDuplicates() {
        ListNode listOne = new ListNode(1);
        listOne.add(3).add(5);
        ListNode listTwo = new ListNode(2);
        listTwo.add(4).add(6);
        ListNode listNode = new Solution().mergeTwoLists(listOne, listTwo);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, listNode.values());
    }

    @Test
    public void testMergeWithDuplicates() {
        ListNode listOne = new ListNode(1);
        listOne.add(1).add(2);
        ListNode listTwo = new ListNode(1);
        listTwo.add(2).add(2);
        ListNode listNode = new Solution().mergeTwoLists(listOne, listTwo);
        assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2}, listNode.values());
    }

}