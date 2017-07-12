public class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int result = 0;
        int lo = 0;
        int hi = len - 1;
        int mid = (lo + hi) / 2;
        if(len == 0) return -1;
        
        for(int i = 0; i < len - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                mid = i;
                break;
            }
        }
        
        while(lo <= hi) {
            if(target == nums[mid]) return mid;
            else if(target < nums[mid] && target >= nums[lo]) hi = mid - 1; 
            else lo = mid + 1;
            mid = (lo + hi) / 2;
        }
        return -1;
    }
}