public class WordSearch {
    private static int M;
    private static int N;
    private static boolean[][] marked;

    public boolean exist(char[][] board, String word) {
        M = board.length;
        N = board[0].length;
        marked = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (dfs(i, j, 0, board, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int i, int j, int k, char[][] board, String word) {
        if (i < 0 || i >= M || j < 0 || j >= N) {
            return false;
        }
        else if (marked[i][j]) {
            return false;
        }
        else if (board[i][j] != word.charAt(k)) {
            return false;
        }
        else if (k == word.length() - 1) {
            return true;
        }
        else {
            marked[i][j] = true;

            if (dfs(i - 1, j, k + 1, board, word) ||
                dfs(i + 1, j, k + 1, board, word) ||
                dfs(i, j - 1, k + 1, board, word) ||
                dfs(i, j + 1, k + 1, board, word)) {
                return true;
            }
        
            marked[i][j] = false;

            return false;
        }
    }

}