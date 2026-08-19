package Easy;
// 485 - Max Consecutive Ones

class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int tempCount = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 1){

                tempCount++;
                if(tempCount > count) count = tempCount;
            }
            else{
                tempCount = 0;
            }
        }

        return count;
    }
}