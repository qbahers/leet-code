public class CountAndSay {
    
    public String countAndSay(int n) {
        String res = "1";
        
        for (int k = 1; k < n; k++) {
            String tmp = "";
            char prev = res.charAt(0);
            int count = 0;
            
            for (int i = 0; i < res.length(); i++) {
                if (res.charAt(i) == prev) {
                    count++;
                }
                else {
                    tmp = tmp + count + prev;
                    count = 1;
                }
                prev = res.charAt(i);
            }
            tmp = tmp + count + prev;
            
            res = tmp;
        }
        
        return res;
    }
    
}