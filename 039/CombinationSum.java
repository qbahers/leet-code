public class CombinationSum {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        return combinationSum(new ArrayList<List<Integer>>(), new ArrayList<Integer>(), 0, candidates, target);
    }
    
    private List<List<Integer>> combinationSum(List<List<Integer>> combinations, List<Integer> combination, int start, int[] candidates, int target) {
        if (target == 0) {
            combinations.add(new ArrayList<Integer>(combination));
        }
        else {
            for (int i = start; i < candidates.length; i++) {
                if (target - candidates[i] >= 0) {
                    combination.add(candidates[i]);
                    combinationSum(combinations, combination, i, candidates, target - candidates[i]);
                    combination.remove(combination.size() - 1);
                }
            }
        }
        
        return combinations;
    }
    
}