/**
 * Time:  O(n * 2^n)
 * Space: O(2^n)
 */

public class CountAndSay {
    
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        
        for (int i = 2; i <= n; i++) {
            StringBuilder tmp = new StringBuilder();
            char prev = res.charAt(0);
            int count = 1;
            
            for (int j = 1; j < res.length(); j++) {
                if (res.charAt(j) == prev) {
                    count++;
                }
                else {
                    tmp.append(count).append(prev);
                    prev = res.charAt(j);
                    count = 1;
                }
            }
            tmp.append(count).append(prev);
            
            res = tmp;
        }
        
        return res.toString();
    }
    
}