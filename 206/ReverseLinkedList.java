/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return reverse;
    }
    
}