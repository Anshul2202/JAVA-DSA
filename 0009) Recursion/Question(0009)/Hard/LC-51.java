// 51 - N-Queens

import java.util.*;

class Solution51 {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        int[] left = new int[n];
        int[] leftUp = new int[2 * n - 1];
        int[] leftDown = new int[2 * n - 1];

        List<List<String>> ans = new ArrayList<>();
        placeQueen(0, n, board, ans, left, leftUp, leftDown);

        return ans;
    }

    public void placeQueen(int col, int n, char[][] board, List<List<String>> ans, int[] left, int[] leftUp, int[] leftDown){

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

                placeQueen(col + 1, n, board, ans, left, leftUp, leftDown);

                board[i][col] = '.';
                left[i] = 0;
                leftDown[i + col] = 0;
                leftUp[n-1 + col-i] = 0;
            }
        }
    }
}