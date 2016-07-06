/**
 * Time:  O(n^3)
 * Space: O(1)
 */

public class 4Sum {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int N = nums.length;
        
        Arrays.sort(nums);
        
        int i = 0;
        while (i < N - 3) {
            int j = i + 1;
            while (j < N - 2) {
                int k = j + 1;
                int l = N - 1;
                
                while (k < l) {
                    int diff = nums[i] + nums[j] + nums[k] + nums[l] - target;
                    
                    if (diff > 0) {
                        l--;
                    }
                    else if (diff == 0) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        
                        while (k + 1 < N  && nums[k + 1] == nums[k]) k++;
                        while (l - 1 >= 0 && nums[l - 1] == nums[l]) l--;
                        k++;
                        l--;
                    }
                    else {
                        k++;
                    }
                }
                while (j + 1 < N - 2 && nums[j + 1] == nums[j]) j++;
                j++;
            }
            while (i + 1 < N - 3 && nums[i + 1] == nums[i]) i++;
            i++;
        }
        
        return res;
    }
    
}