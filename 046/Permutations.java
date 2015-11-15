public class Permutations {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        
        List<Integer> emptyList = new ArrayList<Integer>();
        permutations.add(emptyList);
        
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> perms = new ArrayList<List<Integer>>();
            
            for (List<Integer> permutation : permutations) {
                for (int j = 0; j <= permutation.size(); j++) {
                    List<Integer> perm = new ArrayList<Integer>(permutation);
                    perm.add(j, nums[i]);
                    perms.add(perm);
                }
            }
            permutations = new ArrayList<List<Integer>>(perms);
        }
        
        return permutations;
    }
    
}