/**
 * Time:  O(1)
 * Space: O(1)
 */

public class DivideTwoIntegers {
    
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        int res = 0;
        
        while (a >= b) {
            int count = 1;
            while (a >= (b << count)) {
                count++;
            }
            count--;
            
            res += 1 << count;
            a   -= b << count;
        }
        
        return ((dividend < 0) ^ (divisor < 0)) ? -res : res;
    }
    
}