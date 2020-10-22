package leetcode;

public class Solution_1290_getDecimalValue {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result *= 2;
            result += head.val;
            head = head.next;
        }
        return result;
    }




}
