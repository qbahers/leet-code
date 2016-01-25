public class HouseRobberII {

    public int rob(int[] nums) {
        int N = nums.length;
        
        if (N == 0) return 0;
        if (N == 1) return nums[0];
        
        int[] dp1 = new int[N];
        
        dp1[0] = 0;
        dp1[1] = nums[0];
        
        for (int i = 2; i < N; i++)
            dp1[i] = Math.max(nums[i - 1] + dp1[i - 2], dp1[i - 1]);
        
        int[] dp2 = new int[N + 1];
        
        dp2[0] = 0;
        dp2[1] = 0;
        
        for (int i = 2; i <= N; i++)
            dp2[i] = Math.max(nums[i - 1] + dp2[i - 2], dp2[i - 1]);
        
        return Math.max(dp1[N - 1], dp2[N]);
    }

}