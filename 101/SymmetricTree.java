/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SymmetricTree {
    
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        
        return areSymmetric(root.left, root.right);
    }
    
    private boolean areSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        return p.val == q.val && areSymmetric(p.left, q.right) && areSymmetric(p.right, q.left);
    }
    
}