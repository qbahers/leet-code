/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class PathSumII {
    List<List<Integer>> paths = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        pathSum(root, sum, new ArrayList<Integer>());
        
        return paths;
    }
    
    private void pathSum(TreeNode node, int sum, List<Integer> path) {
        if (node == null) return;
        
        path.add(node.val);
        
        sum -= node.val;

        if (node.left == null && node.right == null && sum == 0) {
            paths.add(new ArrayList<Integer>(path));
        }
        else {
            pathSum(node.left, sum, path);
            pathSum(node.right, sum, path);
        }
        
        path.remove(path.size() - 1);
    }
    
}