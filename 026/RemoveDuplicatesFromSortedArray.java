/**
 * Time:  O(n)
 * Space: O(1)
 */

public class RemoveDuplicatesFromSortedArray {
    
    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        
        int k = 0;
        for (int i = 1; i < N; i++) {
            if (nums[i] == nums[i - 1]) k++;
            
            nums[i - k] = nums[i];
        }
        
        return N - k;
    }
    
}