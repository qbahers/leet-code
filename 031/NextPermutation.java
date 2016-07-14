/**
 * Time:  O(n)
 * Space: O(1)
 */

public class NextPermutation {
    
    public void nextPermutation(int[] nums) {
        int N = nums.length;
        
        int i = N - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        
        if (i >= 0) { 
            int j = N - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        reverse(nums, i + 1, N - 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    private void reverse(int[] nums, int i, int j) {
        while (i < j) swap(nums, i++, j--);
    }
    
}