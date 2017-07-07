/*public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(; i < nums.length; i++) {
            if(target <= nums[i]) break;
        }
        return i;
    }
}*/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = (lo + hi) / 2;
        if(target > nums[hi]) return hi + 1;
        if(target < nums[lo]) return lo;
        do {
            mid = (lo + hi) / 2;
            if(nums[mid] < target) {
                lo = mid;
            } else if(nums[mid] > target) {
                hi = mid;
            } else return mid;
        } while(mid != (lo + hi) / 2);
        return hi;
    }
}