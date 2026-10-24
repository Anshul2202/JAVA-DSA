// 90 - Subsets II

import java.util.*;

class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        getSubSets(0, nums, new ArrayList<>(), res);

        return res;
    }

    public void getSubSets(int idx, int[] nums, List<Integer> list, List<List<Integer>> res){

        res.add(new ArrayList<>(list));
        
        for(int i = idx; i < nums.length; i++){

            if(i > idx && nums[i] == nums[i - 1]) continue;

            list.add(nums[i]);
            getSubSets(i + 1, nums, list, res);
            list.remove(list.size() - 1);
        }
    }
}