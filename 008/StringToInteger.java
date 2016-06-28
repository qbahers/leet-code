/**
 * Time:  O(n)
 * Space: O(1)
 */

public class StringToInteger {
    
    public int myAtoi(String str) {
        str = str.trim();
        
        if (str.isEmpty()) return 0;
        
        int sign = (str.charAt(0) == '-') ? -1 : 1;
        
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            str = str.substring(1);
        }
        
        int res = 0;
        
        for (char c : str.toCharArray()) {
            if (c < '0' || c > '9') break;
            
            int digit = (c - '0');
            
            if (res > (Integer.MAX_VALUE - digit) / 10) return Integer.MAX_VALUE;
            if (res < (Integer.MIN_VALUE + digit) / 10) return Integer.MIN_VALUE;
            
            res = res * 10 + sign * digit;
        }
        
        return res;
    }
    
}