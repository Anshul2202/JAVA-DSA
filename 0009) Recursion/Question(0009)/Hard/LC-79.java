// 79 - Word Search

class Solution79 {
    public boolean exist(char[][] board, String word) {
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++){

                if(board[i][j] == word.charAt(0)){
                    if(myCheck(i, j, 0, word, board)) return true;
                }
            }
        }

        return false;
    }

    public boolean myCheck(int i, int j, int idx, String word, char[][] board){

        if(idx == word.length()) return true;

        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length ||
            board[i][j] != word.charAt(idx)) {
            return false;
        }

        char ch = board[i][j];
        board[i][j] = '.';

        boolean result = myCheck(i, j - 1, idx + 1, word, board)
                        || myCheck(i, j + 1, idx + 1, word, board)
                        || myCheck(i - 1, j, idx + 1, word, board)
                        || myCheck(i + 1, j, idx + 1, word, board);

        board[i][j] = ch;
        
        return result;
        
    }
}