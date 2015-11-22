public class JumpGame {
    
    public boolean canJump(int[] nums) {
        int N = nums.length;
        
        for (int i = N - 2; i >= 0; i--) {
            if (nums[i] != 0) continue;
            
            int j = i - 1;
            while (j >= 0 && nums[j] <= i - j) j--;
            
            if (j < 0) return false;
        }
        
        return true;
    }
    
}