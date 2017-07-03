public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i - 1] == nums[i]) continue;  //skip the same
            int lo = i + 1;
            int hi = nums.length - 1;
            while(lo < hi) {
                if(nums[lo] + nums[hi] < -nums[i]) lo++;
                else if(nums[lo] + nums[hi] > -nums[i]) hi--;
                else {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while(lo < hi && nums[lo - 1] == nums[lo]) lo++;  //skip the same
                    while(lo < hi && nums[hi] == nums[hi + 1]) hi--;  //skip the same
                }
            }
        }
        return result;
    }
}