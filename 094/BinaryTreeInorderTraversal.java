/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreeInorderTraversal {
    
    // Recursive solution

    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal(new ArrayList<Integer>(), root);
    }
    
    private List<Integer> inorderTraversal(List<Integer> list, TreeNode node) {
        if (node == null) return list;
        
        inorderTraversal(list, node.left);
        list.add(node.val);
        inorderTraversal(list, node.right);
        
        return list;
    }

    // Iterative solution

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        
        return res;
    }
    
}