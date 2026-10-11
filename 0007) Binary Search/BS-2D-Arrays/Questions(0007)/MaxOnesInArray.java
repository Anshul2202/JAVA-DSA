// Find row with maximum 1's

class MaxOnesInArraySol {
    public int rowWithMax1s(int[][] mat) {

        int maxCnt = 0, maxIdx = -1;
       
        for(int i = 0; i < mat.length; i++){

            int low = 0, high = mat[i].length - 1;
            int ans = mat[i].length;

            while(low <= high){

                int mid = (low + high) / 2;

                if(mat[i][mid] == 1){
                    ans = mid;
                    high = mid - 1;
                }
                else low = mid + 1;
            }

            int cnt = mat[i].length - ans;

            if(cnt > maxCnt){
                maxCnt = cnt;
                maxIdx = i;
            }
        }

        return maxIdx;
    }
}