public class MoveZeroes {
    
    public void moveZeroes(int[] nums) {
        int i = 0;
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != 0) i++;
            if (nums[i] == 0 && nums[j] != 0) swap(nums, i, j);
        }
        
        return;
    }
    
    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
}