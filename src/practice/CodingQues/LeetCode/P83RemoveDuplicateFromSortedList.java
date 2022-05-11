package practice.CodingQues.LeetCode;

/**
 * Definition for singly-linked list.
 */
public class P83RemoveDuplicateFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode test = head;
        while (test != null) {
            while (test.next != null && test.val == test.next.val) test.next = test.next.next;
            test = test.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
