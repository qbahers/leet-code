public class Subsets {
    
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        
        return subsets(res, nums, 0);
    }
    
    private List<List<Integer>> subsets(List<List<Integer>> res, int[] nums, int k) {
        if (k >= nums.length) return res;
        
        List<List<Integer>> tmp = new ArrayList<List<Integer>>();
        
        for (List<Integer> r : res) {
            List<Integer> copy = new ArrayList<Integer>(r);
            copy.add(nums[k]);
            tmp.add(copy);
        }
        
        res.addAll(tmp);
        
        return subsets(res, nums, k + 1);
    }
    
}