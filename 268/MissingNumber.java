/**
 * Time:  O(n)
 * Space: O(1)
 */

public class MissingNumber {
    
    public int missingNumber(int[] nums) {
        int N = nums.length;
        
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += nums[i];
        
        return N * (N + 1) / 2 - sum;
    }
    
}

/**
 * Time:  O(n)
 * Space: O(1)
 */

public class MissingNumber {
    
    public int missingNumber(int[] nums) {
        int res = 0;
        
        for (int i = 0; i < nums.length; i++)
            res ^= nums[i] ^ (i + 1);
        
        return res;
    }
    
}