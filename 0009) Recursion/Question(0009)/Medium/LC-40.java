// 40 - Combination Sum II

import java.util.*;

class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        
        List<List<Integer>> result = new ArrayList<>();
        getCombSum(0, candidates, target, new ArrayList<>(), result);

        return result;
    }

    public void getCombSum(int idx, int[] nums,int target, List<Integer> list, List<List<Integer>> res) {

        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }


        for(int i = idx; i < nums.length; i++){

            if(nums[i] > target) break;
            if(i > idx && nums[i] == nums[i - 1]) continue;

            list.add(nums[i]);
            getCombSum(i + 1, nums, target - nums[i], list, res);
            list.remove(list.size() - 1);
        }
    }
}