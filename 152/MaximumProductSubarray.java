public class MaximumProductSubarray {
    
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int N = nums.length;
        
        int[] prod = new int[N + 1];
        prod[0] = 1;
        int k = -1;
        
        for (int i = 0; i < N; i++) {
            prod[i + 1] = prod[i] * nums[i];
            
            int d = (prod[i + 1] < 0) ? prod[k + 1] : 1;
            
            res = Math.max(res, prod[i + 1] / d);
            
            if (nums[i] < 0 && k == -1) {
                k = i;
            }
            else if (nums[i] == 0) {
                prod[i + 1] = 1;
                k = -1;
            }
        }
        
        return res;
    }
    
}