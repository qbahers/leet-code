public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (nums[i] + nums[j] == target)
                    return i < j ? new int[]{i + 1, j + 1} : new int[]{j + 1, i + 1};
        
        return new int[]{-1, -1};
    }
    
}