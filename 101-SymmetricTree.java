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
    public boolean isSymmetric(TreeNode root) {
        if(root == null || root.left == null && root.right == null) return true;
        else if(root.left == null || root.right == null) return false;
        else return ifSym(root.left, root.right);
    }
    
    boolean ifSym(TreeNode l, TreeNode r) {
        if(l == null && r == null) return true;
        else if(l == null || r == null) return false;
        else if(l.val != r.val) return false;
        else return ifSym(l.left, r.right) && ifSym(l.right, r.left);
    }
}