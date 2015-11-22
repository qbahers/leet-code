public class SpiralMatrix {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) return res;
        
        int iMin = 0, iMax = matrix.length - 1;
        int jMin = 0, jMax = matrix[0].length - 1;
        
        while (iMin <= iMax && jMin <= jMax) {
            for (int j = jMin; j <= jMax; j++)
                res.add(matrix[iMin][j]);
            
            iMin++;
            
            for (int i = iMin; i <= iMax; i++)
                res.add(matrix[i][jMax]);
            
            jMax--;
                
            for (int j = jMax; j >= jMin && iMin <= iMax; j--)
                res.add(matrix[iMax][j]);
            
            iMax--;
                
            for (int i = iMax; i >= iMin && jMin <= jMax; i--)
                res.add(matrix[i][jMin]);
                
            jMin++;
        }
            
        return res;
    }
    
}