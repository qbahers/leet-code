/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class UniqueBinarySearchTreesII {
    
    public List<TreeNode> generateTrees(int n) {
        if (n <= 0) return new ArrayList<TreeNode>();
        
        return generateTrees(1, n);
    }
    
    private List<TreeNode> generateTrees(int i, int j) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        
        if (i >= j) {
            TreeNode root = (i > j) ? null : new TreeNode(i);
            res.add(root);
        }
        else {
            for (int k = i; k <= j; k++) {
                List<TreeNode> l1 = generateTrees(i, k - 1);
                List<TreeNode> l2 = generateTrees(k + 1, j);
                
                for (TreeNode t1 : l1) {
                    for (TreeNode t2 : l2) {
                        TreeNode root = new TreeNode(k);
                        root.left  = t1;
                        root.right = t2;
                        res.add(root);
                    }
                }
            }
        }
        
        return res;
    }
    
}