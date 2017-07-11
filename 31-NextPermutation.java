public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        if(nums.length < 2) return;
        for(; i > 0; i--) {
            if(i == 1 && nums[i] <= nums[i - 1]) {
                //reverse
                for(int m = 0; m < (nums.length - 1) / 2 + 1; m++){
                    int t = nums[m];
                    nums[m] = nums[nums.length - 1 - m];
                    nums[nums.length - 1 - m] = t;
                }
                return;
            }
            if(nums[i] > nums[i - 1]) break;
        }
        
        int j = nums.length - 1;
        for(; j > i; j--) {
            if(nums[j] > nums[i - 1]) break;
        }
        //swap
        int temp = nums[j];
        nums[j] = nums[i - 1];
        nums[i - 1] = temp;
        //rearrange
        for(int k = i; k < nums.length - 1; k++) {
            for(int l = nums.length - 1; l > k; l--) {
                if(nums[l] < nums[l - 1]) {
                    int tmp = nums[l];
                    nums[l] = nums[l - 1];
                    nums[l - 1] = tmp;
                }
            }
        }
        return;
    }
}