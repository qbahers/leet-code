public class PermutationSequence {
    
    public String getPermutation(int n, int k) {
        List<Integer> l = new ArrayList<Integer>();
        
        for (int i = 1; i <= n; i++) {
            l.add(i);
        }
        
        return getPermutation("", l, n, k - 1);
    }
    
    private String getPermutation(String s, List l, int n, int k) {
        if (n == 0) return s;
        
        int f = factorial(n - 1);
        
        return getPermutation(s + l.remove(k / f), l, n - 1, k % f);
    }
    
    private int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
    
}