
/**
 * Time:  O(log n)
 * Space: O(1)
 */

public class FindMinimumInRotatedSortedArray {
    
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (nums[0] <= nums[mid]) {
                lo = mid + 1;
            }
            else if (nums[0] > nums[mid]) {
                if (mid == 0 || nums[mid - 1] > nums[mid])
                    return nums[mid];
                
                hi = mid - 1;
            }
        }
        
        return nums[0];
    }
    
}