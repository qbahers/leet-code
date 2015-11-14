public class NumberOfIslands {
    private char[][] map;
    private int N, M;
    
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        
        map = grid;
        N = map.length;
        M = map[0].length;
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == '1') {
                    count++;
                    dfs(i, j);
                }
            }
        }
        
        return count;
    }
    
    private void dfs(int i, int j) {
        map[i][j] = '0';
        
        if (i - 1 >= 0 && map[i - 1][j] == '1') dfs(i - 1, j);
        if (i + 1 <  N && map[i + 1][j] == '1') dfs(i + 1, j);
        if (j - 1 >= 0 && map[i][j - 1] == '1') dfs(i, j - 1);
        if (j + 1 <  M && map[i][j + 1] == '1') dfs(i, j + 1);
    }
    
}