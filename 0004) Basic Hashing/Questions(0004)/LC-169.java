// 169 - Majority Element

import java.util.*;

class Solution169 {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        int maxFq = 0;
        int result = 0;
        for(int key : map.keySet()){

            if(map.get(key) > maxFq){
                result = key;
                maxFq = map.get(key);
            }
        }

        return result;
    }
}