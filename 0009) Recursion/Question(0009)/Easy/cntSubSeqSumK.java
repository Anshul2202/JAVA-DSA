// Count all subsequences with sum K

import java.util.*;

class cntSubSeqSumKSol {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {

        return cntSubSeq(0, nums, 0, k, new ArrayList<>());

    }

    public int cntSubSeq(int idx, int[] nums, int sum, int target, List<Integer> list)
    {

        if(idx == nums.length){
            if(sum == target) return 1;
            return 0;
        }

        list.add(nums[idx]);
        sum += nums[idx];

        int l = cntSubSeq(idx + 1, nums, sum, target, list);

        list.remove(list.size() - 1);
        sum -= nums[idx];

        int r = cntSubSeq(idx + 1, nums, sum, target, list);

        return l + r;
    }
}