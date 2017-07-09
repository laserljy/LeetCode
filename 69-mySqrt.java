public class Solution {
    public int mySqrt(int x) {
        int lo = 1;
        int hi = x;
        int mid = (lo + hi) / 2;
        if(x == 1 || x == 0) return x;
        int i = 20;
        while(lo < hi) {
            if(mid > x / mid) hi = mid - 1;
            else if(mid + 1 > x / (mid + 1) || mid == x / mid) break;
            else lo = mid + 1;
            mid = (lo + hi) / 2;
        }
        return mid;
    }
}