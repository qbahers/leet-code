public class RemoveDuplicatesFromSortedArray {
    
    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        
        if (N == 0) return 0;
        
        int k = 0;
        for (int i = 1; i < N; i++) {
            if (nums[i] == nums[i - 1]) k++;
            
            nums[i - k] = nums[i];
        }
        
        return N - k;
    }
    
}