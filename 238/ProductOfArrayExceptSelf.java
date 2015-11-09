/**
 * Time:  O(n)
 * Space: O(n)
 */

public class ProductOfArrayExceptSelf {
    
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        
        int[] res = new int[N];
        Arrays.fill(res, 1);
        
        int left = 1;
        for (int i = 1; i < N; i++) {
            left   *= nums[i - 1];
            res[i] *= left;
        }
        
        int right = 1;
        for (int i = N - 2; i >= 0; i--) {
            right  *= nums[i + 1];
            res[i] *= right;
        }
        
        return res;
    }
    
}