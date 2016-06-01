public class SortColors {
    
    public void sortColors(int[] nums) {
        int N = nums.length;
        
        int i = 0;
        int j = N - 1;
        
        for (int k = 0; k < N; k++) {
            while (k < j && nums[k] == 2) {
                swap(nums, k, j--);
            }
            if (nums[k] == 0) {
                swap(nums, k, i++);
            }
        }
    }
    
    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
}