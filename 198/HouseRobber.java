public class HouseRobber {
    
    public int rob(int[] nums) {
        int N = nums.length;
        
        if (N == 0) return 0;

        int[] dp = new int[N + 1];
        
        dp[0] = 0;
        dp[1] = nums[0];
        
        for (int i = 2; i <= N; i++)
            dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
            
        return dp[N];
        
    }
    
}