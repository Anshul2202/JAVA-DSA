// 229 - Majority Element II

import java.util.*;

class Solution229 {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int vote1 = 0 , vote2 = 0;
        
        for(int i = 0; i < nums.length; i++){

            if(vote1 == 0 && nums[i] != el2){
                el1 = nums[i];
                vote1++;
            }
            else if(vote2 == 0 && nums[i] != el1){
                el2 = nums[i];
                vote2++;
            }
            else if(nums[i] == el1) vote1++;
            else if(nums[i] == el2) vote2++;
            else{
                vote1--;
                vote2--;
            }
        }

        if(isMajority(el1 , nums)) list.add(el1);

        if(isMajority(el2 , nums)) list.add(el2);

        return list;

    }

    public boolean isMajority(int el , int[] nums){
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == el) count++;

            if(count > nums.length / 3) return true;
        }

        return false;
    }
}