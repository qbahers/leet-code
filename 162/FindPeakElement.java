public class FindPeakElement {
    
    public int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length - 2;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (nums[mid] <  nums[mid + 1]) lo = mid + 1;
            else if (nums[mid] >= nums[mid + 1]) hi = mid - 1;
        }
        
        return lo;
    }
    
}