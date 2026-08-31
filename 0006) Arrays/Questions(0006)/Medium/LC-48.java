// 48 - Rotate Image

class Solution48 {
    public void rotate(int[][] matrix) {
        
        for(int i = 0; i < matrix.length; i++){

            for(int j = 0; j < matrix[i].length; j++){

                if(i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            reverseArr(matrix[i]);
        }

    }

    public void reverseArr(int[] nums){

        int i = 0;
        int j = nums.length -1;

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}