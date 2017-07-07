public class Solution {
    public int divide(int dividend, int divisor) {
        long quotient = 0;
        if(divisor == 0) return Integer.MAX_VALUE;
        if(dividend == 0) return 0;
        boolean flag = false;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) flag = true;
        long dd = Math.abs((long)dividend);
        long ds = Math.abs((long)divisor);
        if(dd < ds) return 0;
        else quotient = div(dd, ds);
        if(flag) quotient = 0 - quotient;
        if(quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)quotient;
    }
    
    long div(long dd, long ds) {
        if(dd < ds) return 0;
        long q = 1;
        long s = ds;
        while((ds + ds) <= dd) {
            ds = ds + ds;
            q = q + q;
        }
        return q + div(dd - ds, s);
    }
}

//Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE