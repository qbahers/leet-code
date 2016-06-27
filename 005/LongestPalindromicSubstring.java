/**
 * Time:  O(n^2)
 * Space: O(1)
 */

public class LongestPalindromicSubstring {
    
    public String longestPalindrome(String s) {
        int N = s.length();
        
        int start = 0;
        int end = 1;

        for (int i = 0; i < N; i++) {
            int k = 0;
            while (i - k >= 0 && i + k < N && s.charAt(i - k) == s.charAt(i + k)) {
                k++;
            }
            if (2 * k - 1 > end - start) {
                start = i - k + 1;
                end = i + k;
            }
            
            k = 0;
            while (i - k >= 0 && i + 1 + k < N && s.charAt(i - k) == s.charAt(i + 1 + k)) {
                k++;
            }
            if (2 * k > end - start) {
                start = i - k + 1;
                end = i + 1 + k;
            }
        }
        
        return s.substring(start, end);
    }
    
}