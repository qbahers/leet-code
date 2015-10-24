/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class IntersectionOfTwoLinkedLists {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int N = length(headA);
        int M = length(headB);
        
        int diff = Math.abs(N - M);
        
        if (N < M) {
            while (diff-- > 0) 
                headB = headB.next;
        }
        else {
            while (diff-- > 0) 
                headA = headA.next;
        }
        
        while (headA != null) {
            if (headA == headB)
                return headA;
                
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
    }
    
    private int length(ListNode head) {
        if (head == null) return 0;
        else              return 1 + length(head.next);
    }
    
}