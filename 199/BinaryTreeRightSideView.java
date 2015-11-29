/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreeRightSideView {
    private List<Integer> res = new ArrayList<Integer>();
    
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 1);
        
        return res;
    }
    
    private void dfs(TreeNode node, int depth) {
        if (node == null) return;
        
        if (depth > res.size()) res.add(node.val);
        
        if (node.right != null) dfs(node.right, depth + 1);
        if (node.left  != null) dfs(node.left,  depth + 1);
    }
    
}