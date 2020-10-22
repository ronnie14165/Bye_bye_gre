package leetcode;

public class Solution_83_deleteDuplicates {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode deleteDuplicates(ListNode head) {
        while (head!= null) {
            if (head.val == head.next.val) {
                head = head.next;
            }
        }
        return head;
    }
}
