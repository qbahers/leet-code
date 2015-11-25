public class Triangle {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int N = triangle.size();
        
        int[] row = new int[N];
        
        row[0] = triangle.get(0).get(0);
        
        for (int k = 1; k < N; k++) {
            row[k] = row[k - 1] + triangle.get(k).get(k);
            
            for (int i = k - 1; i > 0; i--)
                row[i] = Math.min(row[i - 1], row[i]) + triangle.get(k).get(i);
            
            row[0] += triangle.get(k).get(0);
        }
        
        int res = Integer.MAX_VALUE;
        
        for (int k = 0; k < N; k++)
            res = Math.min(res, row[k]);
            
        return res;
    }
    
}