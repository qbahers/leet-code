public class LongestCommonPrefix {
    
    public String longestCommonPrefix(String[] strs) {
        int N = strs.length;
        
        if (N == 0) return "";
        if (N == 1) return strs[0];
        
        Arrays.sort(strs);
        
        int k = 0;
        while (k < strs[0].length() && strs[0].charAt(k) == strs[N - 1].charAt(k))
            k++;
        
        return strs[0].substring(0, k);
    }
    
}