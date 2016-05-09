/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreeZigzagLevelOrderTraversal {
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (root == null) return res;
        
        Stack<TreeNode> currentLevel = new Stack<TreeNode>();
        currentLevel.push(root);
        
        boolean leftToRight = true;
        while (!currentLevel.isEmpty()) {
            Stack<TreeNode> nextLevel = new Stack<TreeNode>();
            List<Integer> list = new ArrayList<Integer>();
            
            while (!currentLevel.isEmpty()) {
                TreeNode tree = currentLevel.pop();
                list.add(tree.val);
                
                if (leftToRight && tree.left != null) {
                    nextLevel.add(tree.left);
                }
                if (tree.right != null) {
                    nextLevel.add(tree.right);
                }
                if (!leftToRight && tree.left != null) {
                    nextLevel.add(tree.left);
                }
            }
            
            res.add(list);
            currentLevel = nextLevel;
            leftToRight = !leftToRight;
        }
        
        return res;
    }
    
}