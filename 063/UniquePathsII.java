public class UniquePathsII {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int N = obstacleGrid.length;
        int M = obstacleGrid[0].length;
        
        int[][] dp = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            if (obstacleGrid[i][0] == 1) break;
            dp[i][0] = 1;
        }
        
        for (int j = 0; j < M; j++) {
            if (obstacleGrid[0][j] == 1) break;
            dp[0][j] = 1;
        }
        
        for (int i = 1; i < N; i++)
            for (int j = 1; j < M; j++)
                dp[i][j] = (obstacleGrid[i][j] == 0) ? dp[i - 1][j] + dp[i][j - 1] : 0;
        
        return dp[N - 1][M - 1];
    }
    
}