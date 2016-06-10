/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class InsertionSortList {
    
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode sortedTail = insertionSortList(head.next);
        
        if (head.val <= sortedTail.val) {
            head.next = sortedTail;
            return head;
        }
        else {
            ListNode cur = sortedTail;
            while (cur.next != null && head.val > cur.next.val) {
                cur = cur.next;
            }
            
            if (cur.next == null) {
                cur.next = head;
                head.next = null;
            }
            else {
                ListNode tmp = cur.next;
                cur.next = head;
                cur.next.next = tmp;
            }
            
            return sortedTail;
        }
    }
    
}