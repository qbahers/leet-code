public class MinimumPathSum {
    
    public int minPathSum(int[][] grid) {
        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        
        dp[0][0] = grid[0][0];
        
        for (int i = 1; i < N; i++)
            dp[i][0] = grid[i][0] + dp[i - 1][0];
            
        for (int j = 1; j < M; j++)
            dp[0][j] = grid[0][j] + dp[0][j - 1];
        
        for (int i = 1; i < N; i++)
            for (int j = 1; j < M; j++)
                dp[i][j] = grid[i][j] + Math.min(dp[i][j - 1], dp[i - 1][j]);
        
        return dp[N - 1][M - 1];
    }
    
}