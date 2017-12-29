/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * Time:  O(max(m, n))
 * Space: O(max(m, n))
 */

public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode p = res;
        
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int digit = carry;
            
            if (l1 != null) {
                digit += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                digit += l2.val;
                l2 = l2.next;
            }
            
            carry = digit / 10;
            digit = digit % 10;
            
            p.next = new ListNode(digit);
            p = p.next;
        }
        
        return res.next;
    }
    
}