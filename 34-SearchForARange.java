public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        if(nums.length == 0) return result;
        //left
        while(lo < hi) {
            mid = (lo + hi) / 2;
            if(target > nums[mid]) lo = mid + 1;
            else hi = mid;
        }
        if(target == nums[lo]) result[0] = lo;
        if(result[0] == -1) return result;
        //right
        hi = nums.length - 1;
        while(lo <= hi) {
            mid = (lo + hi) / 2;
            if(target < nums[mid]) hi = mid - 1;
            else lo = mid + 1;
            if(target == nums[hi]) break;
        }
        result[1] = hi;
        return result;
    }
}