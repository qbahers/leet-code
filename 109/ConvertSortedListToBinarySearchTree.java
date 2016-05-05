/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class ConvertSortedListToBinarySearchTree {
    
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode l1 = null;
        if (prev != null) {
            prev.next = null;
            l1 = head;
        }
        ListNode l2 = slow.next;

        TreeNode root = new TreeNode(slow.val);
        root.left  = sortedListToBST(l1);
        root.right = sortedListToBST(l2);
        
        return root;
    }
    
}