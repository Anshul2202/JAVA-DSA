// 78 - Subsets

import java.util.*;

class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        getSubSets(0, nums, new ArrayList<>(), result);

        return result;
    }

    public void getSubSets(int idx, int[] nums, List<Integer> list, List<List<Integer>> result){

        if(idx == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        getSubSets(idx + 1, nums, list, result);

        list.remove(list.size() - 1);
        getSubSets(idx + 1, nums, list, result);
    }
}