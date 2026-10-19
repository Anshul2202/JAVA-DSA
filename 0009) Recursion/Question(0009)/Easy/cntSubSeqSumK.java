// Count all subsequences with sum K

import java.util.*;

class cntSubSewSumKSol {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {

        return cntSubSeq(0, nums, 0, k, 0, new ArrayList<>());

    }

    public int cntSubSeq(int idx, int[] nums, int sum, int target, int cnt, List<Integer> list)
    {
        int result = 0;

        if(idx == nums.length){
            if(sum == target) cnt++;
            return cnt;
        }

        list.add(nums[idx]);
        sum += nums[idx];

        result += cntSubSeq(idx + 1, nums, sum, target, cnt, list);

        list.remove(list.size() - 1);
        sum -= nums[idx];

        result += cntSubSeq(idx + 1, nums, sum, target, cnt, list);

        return result;
    }
}