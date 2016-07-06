/**
 * Time:  O(n^2)
 * Space: O(1)
 */

public class 3Sum {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int N = nums.length;
        
        Arrays.sort(nums);
        
        int i = 0;
        while (i < N - 2) {
            int j = i + 1;
            int k = N - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum > 0) {
                    k--;
                }
                else if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    while (j + 1 < N  && nums[j + 1] == nums[j]) j++;
                    while (k - 1 >= 0 && nums[k - 1] == nums[k]) k--;
                    j++;
                    k--;
                }
                else {
                    j++;
                }
            }
            
            while (i + 1 < N - 2 && nums[i + 1] == nums[i]) i++;
            i++;
        }
        
        return res;
    }
    
}