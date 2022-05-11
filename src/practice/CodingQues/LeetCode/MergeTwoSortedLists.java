package practice.CodingQues.LeetCode;

/**
 * Definition for singly-linked list.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode temp = null;
        while (list1 != null && list2 != null) {
            ListNode curr = list1.val < list2.val ? list1 : list2;
            if (list1 == curr) list1 = list1.next;
            if (list2 == curr) list2 = list2.next;
            if (result == null) result = temp = curr;
            else {
                temp.next = curr;
                temp = temp.next;
            }
        }
        if (temp != null) temp.next = list1 == null ? list2 : list1;
        else result = list1 == null ? list2 : list1;
        return result;
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
