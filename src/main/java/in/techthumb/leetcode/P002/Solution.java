package in.techthumb.leetcode.P002;

class Solution {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodeOne = l1;
        ListNode nodeTwo = l2;
        ListNode pointerToHead = new ListNode(1);
        ListNode nextSumNode = pointerToHead;
        int carryOver = 0;

        while (nodeOne != null || nodeTwo != null) {
            int valueOne = nodeOne == null ? 0 : nodeOne.val;
            int valueTwo = nodeTwo == null ? 0 : nodeTwo.val;
            int value = valueOne + valueTwo;

            value += carryOver;
            carryOver = value / 10;
            value = value % 10;

            nextSumNode.next = new ListNode(value);
            nextSumNode = nextSumNode.next;
            if (nodeOne != null) { nodeOne = nodeOne.next; }
            if (nodeTwo != null) { nodeTwo = nodeTwo.next; }
        }

        if (carryOver > 0) {
            nextSumNode.next = new ListNode(carryOver);
        }
        return pointerToHead.next;
    }
}