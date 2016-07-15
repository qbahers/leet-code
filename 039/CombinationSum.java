public class CombinationSum {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        combinationSum(res, new ArrayList<Integer>(), 0, candidates, target);
        
        return res;
    }
    
    private void combinationSum(List<List<Integer>> res, List<Integer> combination, int k, int[] candidates, int target) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(combination));
        }
        else if (k < candidates.length) {
            if (target - candidates[k] >= 0) {
                combination.add((Integer) candidates[k]);
                combinationSum(res, combination, k, candidates, target - candidates[k]);
                combination.remove((Integer) candidates[k]);
            }
            combinationSum(res, combination, k + 1, candidates, target);
        }
    }
    
}