/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * Time:  O(1)
 * Space: O(1)
 */
 
public class DeleteNodeInALinkedList {
    
    public void deleteNode(ListNode node) {
        node.val  = node.next.val;
        node.next = node.next.next;
    }
    
}