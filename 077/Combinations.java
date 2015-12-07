public class Combinations {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        
        combinations.add(new ArrayList<Integer>());
        
        for (int i = 0; i < k; i++) {
            List<List<Integer>> cs = new ArrayList<List<Integer>>();
            
            for (List<Integer> combination : combinations) {
                int min = combination.isEmpty() ? 1 : combination.get(combination.size() - 1) + 1;
                
                for (int j = min; j <= n; j++) {
                    List<Integer> c = new ArrayList<Integer>(combination);
                    c.add(j);
                    cs.add(c);
                }
            }
            
            combinations = cs;
        }
        
        return combinations;
    }

}