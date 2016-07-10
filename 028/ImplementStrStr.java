// TODO: Use the KMP algorithm instead

/**
 * Time:  O(m * n)
 * Space: O(1)
 */

public class ImplementStrStr {
    
    public int strStr(String haystack, String needle) {
        int M = haystack.length();
        int N = needle.length();
        
        for (int i = 0; i < M - N + 1; i++) {
            int j = 0;
            while (j < N && haystack.charAt(i + j) == needle.charAt(j)) j++;
            
            if (j == N) return i;
        }
        
        return -1;
    }
    
}