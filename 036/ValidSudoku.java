/**
 * Time:  O(9^2)
 * Space: O(3 * 9^2)
 */

public class ValidSudoku {
    
    public boolean isValidSudoku(char[][] board) {
        int[][] rows   = new int[9][9];
        int[][] cols   = new int[9][9];
        int[][] blocks = new int[9][9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                
                int num = board[i][j] - '1';
                
                if (++rows[i][num] > 1) return false;
                if (++cols[j][num] > 1) return false;
                if (++blocks[3 * (i/3) + j/3][num] > 1) return false;
            }
        }
        
        return true;
    }
    
}