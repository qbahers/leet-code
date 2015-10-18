/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class RemoveDuplicatesFromSortedList {
    
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode prev = head;
        ListNode cur = head.next;
        
        while (cur != null) {
            if (cur.val != prev.val) {
                prev.next = cur;
                prev = cur;
            }
            cur = cur.next;
        }
        prev.next = null;

        return head;
    }
    
}