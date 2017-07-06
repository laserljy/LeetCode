public class Solution {
    public int removeElement(int[] nums, int val) {
        int lo = -1;
        int hi = nums.length - 1;
        while(hi >= 0 && nums[hi] == val) hi--;
        while(hi >= 0 && lo < hi) {
            lo++;
            while(hi >= 0 && nums[hi] == val) hi--;
            if(hi > 0 && lo < hi && nums[lo] == val) {
                int temp;
                temp = nums[lo];
                nums[lo] = nums[hi];
                nums[hi] = temp;
                hi--;
            }
        }
        return hi + 1;
    }
}