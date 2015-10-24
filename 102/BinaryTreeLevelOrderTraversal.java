/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreeLevelOrderTraversal {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (root == null) return res;
        
        List<TreeNode> currLevel = new ArrayList<TreeNode>();
        currLevel.add(root);
        
        while (!currLevel.isEmpty()) {
            List<TreeNode> prevLevel = currLevel;
            currLevel = new ArrayList<TreeNode>();
            
            List<Integer> lvl = new ArrayList<Integer>();
            for (TreeNode node : prevLevel) {
                lvl.add(node.val);
                
                if (node.left  != null) currLevel.add(node.left);
                if (node.right != null) currLevel.add(node.right);
            }
            
            res.add(lvl);
        }
        
        return res;
    }
    
}