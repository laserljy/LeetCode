/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return Math.abs(treeHeight(0, root.left) - treeHeight(0, root.right)) <= 1 
            && isBalanced(root.left) && isBalanced(root.right);
    }
    
    int treeHeight(int height, TreeNode node) {
        if(node == null) return height - 1;
        if(node.left == null && node.right == null) return height;
        else return Math.max(treeHeight(height + 1, node.left), treeHeight(height + 1, node.right));
    }
}