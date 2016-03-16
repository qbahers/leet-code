public class LongestSubstringWithoutRepeatingCharacters {
    
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int start = 0;
        int[] flag = new int[256];
        Arrays.fill(flag, -1);
        
        for (int i = 0; i < s.length(); i++) {
            if (flag[s.charAt(i) - '\0'] >= start) {
                start = flag[s.charAt(i) - '\0'] + 1;
            }
            res = Math.max(res, i - start + 1);
            flag[s.charAt(i) - '\0'] = i;
        }
        
        return res;
    }
    
}