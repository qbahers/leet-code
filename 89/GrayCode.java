public class GrayCode {
    
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        
        for (int i = 0; i < n; i++) {
            int N = res.size();
            
            for (int i = N - 1; i >= 0; i--) {
                res.add(N + res.get(i));
            }
        }
        
        return res;
    }
    
}