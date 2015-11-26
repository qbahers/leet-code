public class SetMatrixZeroes {
    
    public void setZeroes(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        
        boolean rowZero = false;
        boolean colZero = false;
        
        for (int i = 0; i < M; i++) {
            if (matrix[i][0] == 0) {
                colZero = true;
                break;
            }
        }
        
        for (int j = 0; j < N; j++) {
            if (matrix[0][j] == 0) {
                rowZero = true;
                break;
            }
        }
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for (int i = 1; i < M; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        for (int j = 1; j < N; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < M; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (colZero) {
            for (int i = 0; i < M; i++) {
                matrix[i][0] = 0;
            }
        }
        
        if (rowZero) {
            for (int j = 0; j < N; j++) {
                matrix[0][j] = 0;
            }
        }
    }

}