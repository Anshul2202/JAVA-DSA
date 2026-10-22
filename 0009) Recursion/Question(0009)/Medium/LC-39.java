// 39 - Combination Sum

import java.util.*;

class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();

        getCombSum(0, candidates, 0, target, new ArrayList<>(), result);

        return result;
    }

    public void getCombSum(int idx, int[] nums, int sum, int k, List<Integer> list, List<List<Integer>> res){

        if(sum > k) return;

        if(idx == nums.length){
            if(sum == k) res.add(new ArrayList<>(list));
            return;
        }

        sum += nums[idx];
        list.add(nums[idx]);
        getCombSum(idx, nums, sum, k, list, res);

        sum -= nums[idx];
        list.remove(list.size() - 1);
        getCombSum(idx + 1, nums, sum, k, list, res);
    }
}