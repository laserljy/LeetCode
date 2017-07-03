public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int lo;
        int hi;
        int diff = Integer.MAX_VALUE;
        int result = 0;
        if(nums.length < 3) return 0;
        for(int i = 0; i < nums.length - 2; i++) {
            lo = i + 1;
            hi = nums.length - 1;
            while(lo < hi) {
                if(diff > Math.abs(target - nums[i] - nums[lo] - nums[hi])) {
                    diff = Math.abs(target - nums[i] - nums[lo] - nums[hi]);
                    result = nums[i] + nums[lo] + nums[hi];
                }
                if(nums[lo] + nums[hi] <= target - nums[i]) lo++;
                else hi--;
            }
        }
        return result;
    }
}