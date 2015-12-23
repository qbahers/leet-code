/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreePreorderTraversal {

    // Recursive solution
    
    public List<Integer> preorderTraversal(TreeNode root) {
        return preorderTraversal(new ArrayList<Integer>(), root);
    }
    
    private List<Integer> preorderTraversal(List<Integer> list, TreeNode node) {
        if (node == null) return list;

        list.add(node.val);
        preorderTraversal(list, node.left);
        preorderTraversal(list, node.right);
        
        return list;
    }

    // Iterative solution

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        
        while (cur != null) {
            res.add(cur.val);
            stack.push(cur);
            cur = cur.left;
            
            while (cur == null && !stack.isEmpty()) {
                cur = stack.pop().right;
            }
        }
        
        return res;
    }
    
}