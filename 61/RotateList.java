/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class RotateList {
    
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        int N = size(head);
        k %= N;

        if (k == 0) return head;

        ListNode p = head;

        for (int i = 0; i < N - k - 1; i++) {
            p = p.next;
        }

        ListNode newHead = p.next;
        ListNode q = p.next;
        p.next = null;

        for (int i = 0; i < k - 1; i++) {
            q = q.next;
        }

        q.next = head;

        return newHead;
    }

    private int size(ListNode head) {
        return (head == null) ? 0 : size(head.next) + 1;
    }
    
}