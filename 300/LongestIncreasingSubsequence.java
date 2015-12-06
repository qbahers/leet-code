public class LongestIncreasingSubsequence {
    
    public int lengthOfLIS(int[] nums) {
        int N = nums.length;
        
        int[] dp = new int[N];
        Arrays.fill(dp, 1);
        
        int res = 0;
        
        for (int i = N - 1; i >= 0; i--) {
            for (int j = i + 1; j < N; j++) {
                if (nums[i] < nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        
        return res;
    }
    
}