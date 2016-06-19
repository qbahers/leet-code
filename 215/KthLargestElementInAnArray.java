import java.util.Random;

public class KthLargestElementInAnArray {

    public int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        
        return nums[nums.length - k];
    }
    
    public int findKthLargest2(int[] nums, int k) {
        shuffle(nums);
        
        int N = nums.length;
        
        int lo = 0, hi = N - 1;
        while (hi > lo) {
            int j = partition(nums, lo, hi);
            if      (j < N - k) lo = j + 1;
            else if (j > N - k) hi = j - 1;
            else return nums[N - k];
        }
        
        return nums[N - k];
    }
    
    private void shuffle(int[] nums) {
        Random random = new Random();
        
        for (int i = 0; i < nums.length; i++) {
            int r = random.nextInt(i + 1);
            swap(nums, i, r);
        }
    }
    
    private int partition(int[] nums, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (nums[++i] <= nums[lo]) {
                if (i == hi) break;
            }
            while (nums[--j] >= nums[lo]) {
                if (j == lo) break;
            }
            if (i >= j) break;
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        
        return j;
    }
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
}