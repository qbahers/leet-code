public class UniqueBinarySearchTrees {
    
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        
        dp[0] = 1;
        
        for (int k = 1; k <= n; k++)
            for (int i = 1; i <= k; i++)
                dp[k] += dp[i - 1] * dp[k - i];

        return dp[n];
    }
    
}