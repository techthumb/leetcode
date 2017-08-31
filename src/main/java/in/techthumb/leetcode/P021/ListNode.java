package in.techthumb.leetcode.P021;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode add(int x) {
        next = new ListNode(x);
        return next;
    }

    int[] values() {
        List<Integer> values = new ArrayList<>();
        ListNode nextNode = this;

        while (nextNode != null) {
            values.add(nextNode.val);
            nextNode = nextNode.next;
        }
        return values.stream().mapToInt(f -> f).toArray();


    }
}