// Rat in a Maze

import java.util.*;

class RatInAMazeSol {
    public List<String> findPath(int[][] grid) {
        List<String> res = new ArrayList<>();
        int[][] isVisited = new int[grid.length][grid[0].length];

        getPath(0, 0, grid, isVisited, new StringBuilder(), res);

        return res;
    }

    public void getPath(int row, int col, int[][] grid, int[][] isVisited, StringBuilder sb, List<String> ans){

        if(row == grid.length - 1 && col == grid[row].length - 1){
            ans.add(sb.toString());
            return;
        }

        isVisited[row][col] = 1;

        if(row + 1 < grid.length && isVisited[row+1][col] == 0 && grid[row+1][col] == 1){
            sb.append('D');
            getPath(row + 1, col, grid, isVisited, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(col - 1 >= 0 && isVisited[row][col-1] == 0 && grid[row][col-1] == 1){
            sb.append('L');
            getPath(row, col - 1, grid, isVisited, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(col + 1 < grid[row].length && isVisited[row][col+1] == 0 && grid[row][col+1] == 1){
            sb.append('R');
            getPath(row, col + 1, grid, isVisited, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(row - 1 >= 0 && isVisited[row-1][col] == 0 && grid[row-1][col] == 1){
            sb.append('U');
            getPath(row - 1, col, grid, isVisited, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }

        isVisited[row][col] = 0;

        
    }
}