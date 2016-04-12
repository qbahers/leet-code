public class SearchA2DMatrixII {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int M = matrix.length;
        int N = matrix[0].length;
        
        for (int i = 0; i < M; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][N - 1]) {
                if (binarySearch(matrix[i], target)) return true;
            }
        }
        
        return false;
    }
    
    private boolean binarySearch(int[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return true;
        }
        
        return false;
    }
    
}