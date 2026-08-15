// 1752 - Check if Array Is Sorted and Rotated

class Solution1752 {
    public boolean check(int[] nums) {

        if(isSorted(nums)) return true;

        for(int i = 0; i < nums.length - 1; i++){
            rotateArr(nums);

            if(isSorted(nums)) return true;
        }

        return false;

    }

    public boolean isSorted(int[] nums){

        for(int i = 1; i < nums.length; i++){

            if( !(nums[i] >= nums[i - 1]) ){
                return false;
            }
        }

        return true;
    }

    public void rotateArr(int[] nums){

        int temp1 = 0;
        int temp2 = nums[0];

        for(int i = 0; i < nums.length - 1; i++){
            temp1 = nums[i + 1];
            nums[i + 1] = temp2;
            temp2 = temp1;
        }

        nums[0] = temp2;
    }
}