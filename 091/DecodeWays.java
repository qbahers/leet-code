public class DecodeWays {
    
    public int numDecodings(String s) {
        if (s.isEmpty()) return 0;
        
        int N = s.length();
        
        int[] dp = new int[N + 1];
        dp[0] = 1;
        
        for (int i = 1; i <= N; i++) {
            int num1 = Integer.parseInt(s.substring(i - 1, i));
            
            if (num1 != 0) {
                dp[i] = dp[i - 1];
            }
            
            if (i - 2 < 0) continue;
            
            int num2 = Integer.parseInt(s.substring(i - 2, i));
            int num3 = Integer.parseInt(s.substring(i - 2, i - 1));
            
            if (num2 == 0) {
                dp[i] = 0;
            }
            else if (num2 <= 26 && num3 != 0) {
                dp[i] += dp[i - 2];
            }
        }
        
        return dp[N];
    }
    
}