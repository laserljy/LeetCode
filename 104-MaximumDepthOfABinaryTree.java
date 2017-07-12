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
    
    int maxLen = 0;
    
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        depth(root, 1);
        return maxLen;
    }
    
    public void depth(TreeNode root, int len) {
        if(root.left == null && root.right == null) {
            if(maxLen < len) maxLen = len;
        }
        if(root.left != null) {
            depth(root.left, len + 1);
        }
        if(root.right != null) {
            depth(root.right, len + 1);
        }
    }
}