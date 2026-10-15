// 1901 - Find a Peak Element II

class Solution1901 {
    public int[] findPeakGrid(int[][] mat) {
        
        int low = 0, high = mat[0].length - 1;

        while(low <= high){
            
            int mid = (low + high) / 2;
            int left = -1, right = -1;

            int row = maxEl(mat , mid);
            int val = mat[row][mid];

            if(mid - 1 >= 0) left = mat[row][mid - 1];

            if(mid + 1 < mat[0].length) right = mat[row][mid + 1];

            if(val > left && val > right) return new int[]{row, mid};
            else if(left > val) high = mid - 1;
            else low = mid + 1;
        }

        return new int[]{-1, -1};
    }

    public int maxEl(int[][] nums, int col){

        int max = -1, idx = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i][col] > max){
                max = nums[i][col];
                idx = i;
            }
        }

        return idx;
    }
}