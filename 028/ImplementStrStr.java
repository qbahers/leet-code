public class ImplementStrStr {
    
    public int strStr(String haystack, String needle) {
        int N = haystack.length();
        int M = needle.length();
        
        for (int i = 0; i < N - M + 1; i++) {
            int j = i;
            int k = 0;
            while (k < M && haystack.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
            }
            
            if (k == M) return i;
        }
        
        return -1;
    }
    
}