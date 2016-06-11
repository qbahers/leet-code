/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class SortList {
    
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;
        
        return mergeList(sortList(l1), sortList(l2));
    }
    
    private ListNode mergeList(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        if (l1.val < l2.val) {
            l1.next = mergeList(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeList(l1, l2.next);
            return l2;
        }
    }
    
}