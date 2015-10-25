/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreePaths {
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        
        if (root == null) return paths;
        
        paths.add("" + root.val);
        
        return computePaths(paths, root);
    }
    
    private List<String> computePaths(List<String> paths, TreeNode node) {
        if (node.left == null && node.right == null) {
            return paths;
        }
        else {
            List<String> leftPaths  = new ArrayList<String>();
            List<String> rightPaths = new ArrayList<String>();
            
            if (node.left != null) {
                List<String> p = new ArrayList<String>();
                for (String path : paths)
                    p.add(path + "->" + node.left.val);
                    
                leftPaths  = computePaths(p, node.left);
            }
            
            if (node.right != null) {
                List<String> q = new ArrayList<String>();
                for (String path : paths)
                    q.add(path + "->" + node.right.val);
                
                rightPaths = computePaths(q, node.right);
            }
            
            List<String> allPaths = leftPaths;
            allPaths.addAll(rightPaths);
            
            return allPaths;
        }
    }
}