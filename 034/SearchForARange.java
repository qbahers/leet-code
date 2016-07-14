/**
 * Time:  O(log(n))
 * Space: O(1)
 */

public class SearchForARange {
    
    public int[] searchRange(int[] nums, int target) {
        int N = nums.length;
        
        int lo = 0;
        int hi = N - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else                    hi = mid - 1;
        }
        int start = (lo < N && nums[lo] == target) ? lo : -1;
        
        lo = 0;
        hi = N - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) hi = mid - 1;
            else                    lo = mid + 1;
        }
        int end = (hi >= 0 && nums[hi] == target) ? hi : -1;
        
        return new int[] {start, end};
    }
    
}