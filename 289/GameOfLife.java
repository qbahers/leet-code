public class GameOfLife {
    
    public void gameOfLife(int[][] board) {
        if (board.length == 0) return;
        
        int M = board.length;
        int N = board[0].length;
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int num = liveNeighbors(board, M, N, i, j);
        
                if ((board[i][j] & 1) == 1 && (num == 2 || num == 3)) board[i][j] |= 2;
                if ((board[i][j] & 1) == 0 && num == 3)               board[i][j] |= 2;
            }
        }
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] >>= 1;
            }
        }
    }
    
    private int liveNeighbors(int[][] board, int M, int N, int i, int j) {
        int count = 0;
        
        for (int k = Math.max(i - 1, 0); k < Math.min(i + 2, M); k++) {
            for (int l = Math.max(j - 1, 0); l < Math.min(j + 2, N); l++) {
                if (k == i && l == j) continue;
                
                count += board[k][l] & 1;
            }
        }
        
        return count;
    }
    
}