/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int N = inorder.length;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            map.put(inorder[i], i);
        }
        
        return buildTree(map, inorder, 0, N - 1, postorder, 0, N - 1);
    }
    
    private TreeNode buildTree(Map<Integer, Integer> map, int[] inorder, int i, int j, int[] postorder, int k, int l) {
        if (k > l) return null;
        
        int mid = map.get(postorder[l]);
        
        TreeNode root = new TreeNode(postorder[l]);
        root.left  = buildTree(map, inorder, i, mid - 1, postorder, k, k + mid - i - 1);
        root.right = buildTree(map, inorder, mid + 1, i, postorder, k + mid - i, l - 1);
        
        return root;
    }
    
}