// 128 - Longest Consecutive Sequence

import java.util.*;

class Solution128 {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int count = 0;
        int maxCount = 1;
        int val = 0;

        for(int i : set){

            val = i;

            if(!set.contains(val - 1)){
                count = 1;

                while(set.contains(val + 1)){
                    count++;
                    val++;
                }
            }

            if(count > maxCount) maxCount = count;
        }

        return maxCount;
    }
}