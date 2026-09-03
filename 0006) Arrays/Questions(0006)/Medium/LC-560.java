// 560 - Subarray Sum Equals K

import java.util.*;

class Solution560 {
    
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer , Integer> map = new HashMap<>();

        int prefixSum = 0;
        int remVal = 0;
        int count = 0;

        map.put(prefixSum , 1);

        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            remVal = prefixSum - k;

            if(map.containsKey(remVal)){
                count += map.get(remVal);
            }

            map.put(prefixSum , map.getOrDefault(prefixSum , 0) + 1);
        }

        return count;
    }
}