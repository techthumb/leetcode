package in.techthumb.leetcode.P021;

class Solution {
    ListNode mergeTwoLists(ListNode listOne, ListNode listTwo) {
        ListNode headPointer = new ListNode(0);
        ListNode current = headPointer;

        while (listOne != null || listTwo != null) {
            int nextVal;
            if (listOne == null) {
                nextVal = listTwo.val;
                listTwo = listTwo.next;
            } else if (listTwo == null) {
                nextVal = listOne.val;
                listOne = listOne.next;
            } else if (listOne.val > listTwo.val) {
                nextVal = listTwo.val;
                listTwo = listTwo.next;
            } else {
                nextVal = listOne.val;
                listOne = listOne.next;
            }

            current.next = new ListNode(nextVal);
            current = current.next;
        }
        return headPointer.next;
    }
}