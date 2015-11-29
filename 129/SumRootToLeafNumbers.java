/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
    
    private int sumNumbers(TreeNode node, int sum) {
        if (node == null) return 0;
        
        sum = sum * 10 + node.val;
        
        if (node.left == null && node.right == null) return sum;   
        
        return sumNumbers(node.left, sum) + sumNumbers(node.right, sum);
    }
    
}