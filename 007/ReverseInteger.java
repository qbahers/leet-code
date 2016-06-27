/**
 * Time:  O(d) where d is the number of digits of the integer
 * Space: O(1)
 */

public class ReverseInteger {
    
    public int reverse(int x) {
        long res = 0;
        
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0;
        
        return (int) res;
    }
    
}