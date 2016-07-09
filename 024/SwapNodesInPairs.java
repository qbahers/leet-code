/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
/**
 * Time:  O(n)
 * Space: O(1) (for the iterative solution)
 */

public class SwapNodesInPairs {
    
    // Recursive solution
    
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode h = head.next.next;
        
        ListNode res = head.next;
        res.next = head;
        res.next.next = swapPairs(h);
        
        return res;
    }
    
    // Iterative solution
    
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        
        ListNode cur = dummy;
        while (head != null && head.next != null) {
            ListNode h = head.next.next;
            
            cur.next = head.next;
            cur.next.next = head;
            
            cur = cur.next.next;
            head = h;
        }
        cur.next = head;
        
        return dummy.next;
    }
    
}