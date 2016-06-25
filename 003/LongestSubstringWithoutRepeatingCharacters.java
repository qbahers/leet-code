/**
 * Time:  O(n)
 * Space: O(1)
 */

public class LongestSubstringWithoutRepeatingCharacters {
    
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int j = 0;
        
        int[] flag = new int[256];
        Arrays.fill(flag, -1);
        
        for (int i = 0; i < s.length(); i++) {
            j = Math.max(j, flag[s.charAt(i)] + 1);
            res = Math.max(res, i - j + 1);
            flag[s.charAt(i)] = i;
        }
        
        return res;
    }
    
}