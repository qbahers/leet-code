/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class RemoveNthNodeFromEndOfList {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        
        ListNode p = head;
        ListNode q = head;
        
        while (p != null) {
            p = p.next;
            
            if (n >= 0) n--;
            else        q = q.next;
        }
        
        if (n == 0) return head.next;
        
        q.next = q.next.next;
        
        return head;
    }
    
}