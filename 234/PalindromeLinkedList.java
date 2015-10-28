/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class PalindromeLinkedList {
    
    public boolean isPalindrome(ListNode head) {
        int N = size(head);
        
        ListNode p = head;
        for (int i = 0; i < (N + 1) / 2; i++)
            p = p.next;
            
        ListNode q = reverseList(p);
        
        for (int i = 0; i < N / 2; i++) {
            if (head.val == q.val) {
                head = head.next;
                q = q.next;
            } 
            else {
                return false;
            }
        }
        
        return true;
    }
    
    private int size(ListNode head) {
        return (head == null) ? 0 : size(head.next) + 1;
    }
    
    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return reverse;
    }
    
}