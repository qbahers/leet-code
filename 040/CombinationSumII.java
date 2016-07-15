public class CombinationSumII {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        Arrays.sort(candidates);
        combinationSum2(res, new ArrayList<Integer>(), 0, candidates, target);
        
        return res;
    }
    
    private void combinationSum2(List<List<Integer>> res, List<Integer> combination, int k, int[] candidates, int target) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(combination));
        }
        else if (k < candidates.length) {
            if (target - candidates[k] >= 0) {
                combination.add((Integer) candidates[k]);
                combinationSum2(res, combination, k + 1, candidates, target - candidates[k]);
                combination.remove((Integer) candidates[k]);
            }
            while (k + 1 < candidates.length && candidates[k + 1] == candidates[k]) k++;
            combinationSum2(res, combination, k + 1, candidates, target);
        }
    }
    
}