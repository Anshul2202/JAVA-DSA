// 1 - Two Sum

import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        HashMap<Integer , Integer> map = new HashMap<>();
        int newTarget = 0;

        for(int i = 0; i < nums.length; i++){

            newTarget = target - nums[i];
            
            if(map.containsKey(newTarget)){
                result[1] = map.get(newTarget);
                result[0] = i;
                return result;
            }
            else{
                map.put(nums[i] , i);
            }
            
        }


        return result;
    }
}