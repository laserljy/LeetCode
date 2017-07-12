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
    boolean flag = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        else return ifSame(p, q);
    }
    
    boolean ifSame(TreeNode a, TreeNode b) {
        //if(a != b) return false;
        if(a == null && b == null) flag = true;
        else if(a == null || b == null) flag = false;
        else if(a.val != b.val) flag = false;
        else return ifSame(a.left, b.left) && ifSame(a.right, b.right);
        return flag;
    }
}