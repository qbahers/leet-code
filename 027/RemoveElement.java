public class RemoveElement {
    
    public int removeElement(int[] nums, int val) {
        int N = nums.length;
        
        int k = 0;
        for (int i = 0; i < N; i++) {
            nums[i - k] = nums[i];
            
            if (nums[i] == val) k++;
        }
        
        return N - k;
    }
    
}