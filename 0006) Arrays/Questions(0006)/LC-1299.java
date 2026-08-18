// 1299 - Replace Elements with Greatest Element on Right Side

class Solution1299 {
    public int[] replaceElements(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++){

            int max = nums[i + 1];

            for(int j = i + 1; j < nums.length; j++){

                if(nums[j] > max){
                    max = nums[j];
                }
            }

            nums[i] = max;
        }

        nums[nums.length - 1] = -1;

        return nums;
    }
}