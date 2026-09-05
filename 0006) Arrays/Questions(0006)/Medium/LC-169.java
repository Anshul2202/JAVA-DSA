// 169 - Majority Element

class Solution169 {
    public int majorityElement(int[] nums) {

        int el = -1;
        int vote = 0;

        for(int i = 0; i < nums.length; i++){

            if(vote == 0) el = nums[i];

            if(nums[i] == el) vote++;
            else vote--;
        }

        return el;
    }
}