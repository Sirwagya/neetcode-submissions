class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] checkRow = new boolean[10];
            boolean[] checkCol = new boolean[10];
            boolean[] checkBox = new boolean[10];

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int currRow = board[i][j] - '0';
                    if (checkRow[currRow]) return false;
                    checkRow[currRow] = true;
                }

                if (board[j][i] != '.') {
                    int currCol = board[j][i] - '0';
                    if (checkCol[currCol]) return false;
                    checkCol[currCol] = true;
                }

                int boxRow = (i / 3) * 3 + (j / 3);
                int boxCol = (i % 3) * 3 + (j % 3);
                
                if (board[boxRow][boxCol] != '.') {
                    int currBox = board[boxRow][boxCol] - '0';
                    if (checkBox[currBox]) return false;
                    checkBox[currBox] = true;
                }
            }
        }
        return true;
    }
}