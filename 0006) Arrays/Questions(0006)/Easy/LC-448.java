package Easy;

// 448 - Find All Numbers Disappeared in an Array

import java.util.*;

class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            map.put(nums[i] , 0);
        }

        for(int i = 1; i <= nums.length; i++){

            if(!map.containsKey(i)) list.add(i);
        }

        return list;
    }
}