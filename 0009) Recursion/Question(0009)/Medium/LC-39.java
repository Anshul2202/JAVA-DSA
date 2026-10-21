// 39 - Combination Sum

import java.util.*;

class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        getCombSum(0, candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    public void getCombSum(int idx, int[] nums, int k, int sum, List<Integer> list, List<List<Integer>> result){
        if(sum > k) return;

        if(idx == nums.length){
            if(sum == k) result.add(new ArrayList<>(list));
            return;
        }

        sum += nums[idx];
        list.add(nums[idx]);
        getCombSum(idx, nums, k, sum, list, result);

        sum -= nums[idx];
        list.remove(list.size() - 1);
        getCombSum(idx + 1, nums, k, sum, list, result);
    }
}