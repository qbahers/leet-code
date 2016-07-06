/**
 * Time:  O(n^2)
 * Space: O(1)
 */

public class 3SumClosest {
    
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        int N = nums.length;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < N - 2; i++) {
            int j = i + 1;
            int k = N - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (Math.abs(sum - target) < Math.abs(res - target)) res = sum;
                
                if (sum - target > 0) {
                    k--;
                }
                else if (sum - target == 0) {
                    return res;
                }
                else {
                    j++;
                }
            }
        }
        
        return res;
    }
    
}