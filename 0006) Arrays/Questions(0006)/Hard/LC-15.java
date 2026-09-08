// 15 - 3Sum

import java.util.*;

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> tripletSet = new HashSet<>();

        HashSet<Integer> tempSet = new HashSet<>();
        List<Integer> tempList = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){

                int val3 = -(nums[i] + nums[j]);

                if(tempSet.contains(val3)){
                    tempList.addAll(List.of(nums[i] , nums[j] , val3));
                    Collections.sort(tempList);

                    tripletSet.add(new ArrayList<>(tempList));
                    tempList.clear();
                }

                tempSet.add(nums[j]);
            }
            tempSet.clear();
        }

        List<List<Integer>> ans = new ArrayList<>(tripletSet);

        return ans;
    }
}