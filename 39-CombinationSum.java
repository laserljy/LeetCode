public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates.length == 0) return result;
        Arrays.sort(candidates);
        findCombination(result, candidates, target, 0, new ArrayList<Integer>());
        return result;
    }
    
    void findCombination(List<List<Integer>> result, int[] nums, int target, int i, List<Integer> list) {
        if(target > 0) {
            for(int j = i; j < nums.length; j++) {
                list.add(nums[j]);
                findCombination(result, nums, target - nums[j], j, list);
                list.remove(list.size() - 1);
            }
        }
        else if(target == 0) result.add(new ArrayList<>(list));
        else return;
    }
}