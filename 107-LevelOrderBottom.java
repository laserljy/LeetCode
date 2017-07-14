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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        addLevel(result, 0, root);
        return result;
    }
    
    void addLevel(List<List<Integer>> result, int level, TreeNode node) {
        if(node == null) return;
        List<Integer> list = new ArrayList<>();
        if(result.size() <= level) result.add(0, new ArrayList<>());
        list = result.get(result.size() - 1 - level);
        list.add(node.val);
        result.set(result.size() - 1 - level, list);
        addLevel(result, level + 1, node.left);
        addLevel(result, level + 1, node.right);
    }
}