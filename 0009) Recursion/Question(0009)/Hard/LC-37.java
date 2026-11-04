// 37 - Sudoku Solver

class Solution37 {
    public void solveSudoku(char[][] board) {
        mySolve(board);
    }

    public boolean mySolve(char[][] board){

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){

                if(board[i][j] == '.'){

                    for(char c = '1'; c <= '9'; c++){

                        if(isValid(c, i, j, board)){
                            board[i][j] = c;
                            if(mySolve(board)) return true;
                            board[i][j] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValid(char c, int row, int col, char[][] board){

        for(int i = 0; i <= 8; i++){

            if(board[row][i] == c) return false;

            if(board[i][col] == c) return false;

            if(board[3 * (row/3) + i/3][3 * (col/3) + i % 3] == c) return false;
        }

        return true;
    }
}