/**
 * Time:  O(d) where d is the number of digits of the integer
 * Space: O(1)
 */

public class PalindromeNumber {
    
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int i = 1;
        while (x / i >= 10) {
            i *= 10;
        }
        
        while (i > 0) {
            int left  = x / i;
            int right = x % 10;
            
            if (left != right) return false;

            x = (x % i) / 10;
            i /= 100;
        }
        
        return true;
    }
    
}