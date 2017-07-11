public class Solution {
    public int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int oneStepBack = 2;
        int twoStepBack = 1;
        int allWays = 0;
        
        for(int i = 3; i <= n; i++) {
            allWays = oneStepBack + twoStepBack;
            twoStepBack = oneStepBack;
            oneStepBack = allWays;
        }
        
        return allWays;
    }
}