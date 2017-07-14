public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> col = new HashSet<>();
        HashSet<Character> cube = new HashSet<>();
        
        for(int i = 0; i < 9; i++) {
            //check ith row, ith col, ith cube
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.' && !row.contains(board[i][j])) 
                    row.add(board[i][j]);
                else if(row.contains(board[i][j])) return false;
                if(board[j][i] != '.' && !col.contains(board[j][i])) 
                    col.add(board[j][i]);
                else if(col.contains(board[j][i])) return false;
                if(board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] != '.' && 
                   !cube.contains(board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3])) 
                    cube.add(board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3]);
                else if(cube.contains(board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3])) return false;
            }
            row.clear();
            col.clear();
            cube.clear();
        }
        return true;
    }
}