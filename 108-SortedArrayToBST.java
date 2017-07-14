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
    public TreeNode sortedArrayToBST(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = (lo + hi) / 2;
        if(nums.length == 0) return null;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = addNode(lo, mid - 1, nums);
        root.right = addNode(mid + 1, hi, nums);
        return root;
    }
    
    TreeNode addNode(int lo, int hi, int[] nums) {
        int mid = (lo + hi) / 2;
        if(nums.length < mid + 1) return null;
        TreeNode node = new TreeNode(nums[mid]);
        if(lo == hi) return node;
        else if(lo < hi) {
            node.left = addNode(lo, mid - 1, nums);
            node.right = addNode(mid + 1, hi, nums);    
        }
        else return null;
        return node;
    }
}