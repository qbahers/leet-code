public class ValidSudoku {
    
    public boolean isValidSudoku(char[][] board) {
        
        // Check sub-boxes
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                Set<Character> set = new HashSet<Character>();
                
                for (int i = 3 * k; i < 3 * k + 3; i++) {
                    for (int j = 3 * l; j < 3 * l + 3; j++) {
                        if (board[i][j] != '.' && set.contains(board[i][j]))
                            return false;
                        else
                            set.add(board[i][j]);
                    }
                }
            }
        }
        
        // Check row
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<Character>();
            
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && set.contains(board[i][j]))
                    return false;
                else
                    set.add(board[i][j]);
            }
        }
        
        // Check column
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<Character>();
            
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.' && set.contains(board[i][j]))
                    return false;
                else
                    set.add(board[i][j]);
            }
        }
        
        return true;
    }
    
}