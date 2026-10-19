// Check if there exists a subsequence with sum K

import java.util.*;

class subSeqSumKSol {
    public boolean checkSubsequenceSum(int[] nums, int k) {
         return myCheck(0 , nums, new ArrayList<>(), 0, k);
    }

    public boolean myCheck(int idx, int[] nums, List<Integer> list, int sum, int target){

        if(idx == nums.length) {
            if(sum == target) return true;
            return false;
        }

        list.add(nums[idx]);
        sum += nums[idx];

        if(myCheck(idx + 1, nums, list, sum, target)) return true;

        list.remove(list.size() - 1);
        sum -= nums[idx];

        if(myCheck(idx + 1, nums, list, sum, target)) return true;

        return false;
    }
}