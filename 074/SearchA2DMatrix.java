public class SearchA2DMatrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        int hi = matrix.length - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (target < matrix[mid][0]) hi = mid - 1;
            else if (target > matrix[mid][0]) lo = mid + 1;
            else return true;
        }
        
        if (lo - 1 < 0) return false;
        
        int l = 0;
        int h = matrix[lo - 1].length - 1;
        
        while (l <= h) {
            int m = l + (h - l) / 2;
            if      (target < matrix[lo - 1][m]) h = m - 1;
            else if (target > matrix[lo - 1][m]) l = m + 1;
            else return true;
        }
        
        return false;
    }
    
}