public class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[temp] == nums[i]) continue;
            nums[temp + 1] = nums[i];
            temp++;
        }
        return temp + 1;
    }
}