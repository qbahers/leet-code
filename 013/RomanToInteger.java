/**
 * Time:  O(n)
 * Space: O(1)
 */

public class RomanToInteger {
    
    public int romanToInt(String s) {
        int N = s.length();
        
        int[] a = new int[26];
        
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;
        
        int res = 0;
        for (int i = N - 1; i >= 0; i--) {
            int cur = a[s.charAt(i) - 'A'];
            
            if (i + 1 < N && cur < a[s.charAt(i + 1) - 'A']) {
                res -= cur;
            }
            else {
                res += cur;
            }
        }
        
        return res;
    }
    
}