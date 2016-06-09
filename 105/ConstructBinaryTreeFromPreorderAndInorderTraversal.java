/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int N = inorder.length;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            map.put(inorder[i], i);
        }
        
        return buildTree(map, preorder, 0, N - 1, inorder, 0, N - 1);
    }
    
    private TreeNode buildTree(Map<Integer, Integer> map, int[] preorder, int i, int j, int[] inorder, int k, int l) {
        if (i > j) return null;
        
        int mid = map.get(preorder[i]);
        
        TreeNode root = new TreeNode(preorder[i]);
        root.left  = buildTree(map, preorder, i + 1, i + mid - k, inorder, k, mid - 1);
        root.right = buildTree(map, preorder, i + mid - k + 1, j, inorder, mid + 1, l);
        
        return root;
    }
    
}