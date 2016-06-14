/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class CountCompleteTreeNodes {
    
    public int countNodes(TreeNode root) {
        int h = height(root);
        
        int res = 0;
        while (root != null) {
            if (isPerfect(root.left, h - 1)) {
                res += 1 << h;
                root = root.right;
            }
            else {
                res += 1 << (h - 1);
                root = root.left;
            }
            h--;
        }
        
        return res;
    }
    
    private int height(TreeNode root) {
        int res = -1;
        
        while (root != null) {
            root = root.left;
            res++;
        }
        
        return res;
    }
    
    private boolean isPerfect(TreeNode root, int h) {
        while (root != null) {
            root = root.right;
            h--;
        }
        
        return h == -1;
    }
    
}