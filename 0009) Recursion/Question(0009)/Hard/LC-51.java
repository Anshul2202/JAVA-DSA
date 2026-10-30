// 51 - N-Queens

import java.util.*;

class Solution51 {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        int[] left = new int[n];
        int[] leftDown = new int[2 * n - 1];
        int[] leftUp = new int[2 * n - 1];

        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        placeQueen(0, board, n, ans, left, leftDown, leftUp);

        return ans;
    }

    public void placeQueen(int col, char[][] board, int n, List<List<String>> ans, int[] left, int[] leftDown, 
    int[] leftUp){

        if(col == n){
            List<String> temp = new ArrayList<>();

            for(int i = 0; i < board.length; i++){
                temp.add(new String(board[i]));
            }

            ans.add(new ArrayList<>(temp));
            return;
        }


        for(int i = 0; i < n; i++){

            if(left[i] == 0 && leftDown[i + col] == 0 && leftUp[n-1 + col-i] == 0){
                board[i][col] = 'Q';
                left[i] = 1;
                leftDown[i + col] = 1;
                leftUp[n-1 + col-i] = 1;

                placeQueen(col + 1, board, n, ans, left, leftDown, leftUp);

                board[i][col] = '.';
                left[i] = 0;
                leftDown[i + col] = 0;
                leftUp[n-1 + col-i] = 0;
            }
        }
    }
}