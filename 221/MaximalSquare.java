public class MaximalSquare {
    
    public int maximalSquare(char[][] matrix) {
        int M = matrix.length;
        if (M == 0) return 0;
        int N = matrix[0].length;
        
        int L = 0;
        for (int i = 0; i < M - L; i++) {
            for (int j = 0; j < N - L; j++) {
                int l = 0;
                
                outer:
                while (i + l < M && j + l < N) {
                    for (int k = i; k <= i + l; k++) {
                        if (matrix[k][j + l] == '0') {
                            break outer;
                        }
                    }
                    for (int k = j; k < j + l; k++) {
                        if (matrix[i + l][k] == '0') {
                            break outer;
                        }
                    }
                    l++;
                }
                
                L = Math.max(L, l);
            }
        }
        
        return L * L;
    }
    
}