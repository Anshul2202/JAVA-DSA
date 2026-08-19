package Medium;

// 665 - Non-decreasing Array

class Solution665 {
    public boolean checkPossibility(int[] nums) {

        boolean hasLifeLine = true;
        
        for(int i = 0; i < nums.length - 1; i++){

            if( !(nums[i] <= nums[i + 1]) ){

                if(hasLifeLine){
                    hasLifeLine = false;
                    
                    if(i == 0 || nums[i + 1] >= nums[i - 1]){
                        nums[i] = nums[i + 1];
                    }
                    else{
                        nums[i + 1] = nums[i];
                    }
                }
                else return false;
            }
        }

        return true;
    }
}