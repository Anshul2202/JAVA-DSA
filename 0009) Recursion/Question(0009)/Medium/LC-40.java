// 40 - Combination Sum II

import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        
        HashSet<List<Integer>> set = new HashSet<>();
        getCombSum(0, candidates, 0, target, new ArrayList<>(), set);

        List<List<Integer>> result = new ArrayList<>();

        for(List<Integer> i : set){
            result.add(i);
        }

        return result;
    }

    public void getCombSum(int idx, int[] nums, int sum, int k, List<Integer> list, HashSet<List<Integer>> res)
    {
        if(idx == nums.length){
            if(sum == k) res.add(new ArrayList<>(list));
            return;
        }

        sum += nums[idx];
        list.add(nums[idx]);
        getCombSum(idx + 1, nums, sum, k, list, res);

        sum -= nums[idx];
        list.remove(list.size() - 1);
        getCombSum(idx + 1, nums, sum, k, list, res);
    }
}