// 18 - 4Sum

import java.util.*;

class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        int i = 0, j = 0, k = 0 , l = 0;

        while(i < nums.length){
            j = i + 1;

            while(j < nums.length){

                k = j + 1;
                l = nums.length - 1;

                while(k < l){

                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum < target){
                        k++;
                        while(k < l && nums[k] == nums[k - 1]) k++;
                    }
                    else if(sum > target){
                        l--;
                        while(k < l && nums[l] == nums[l + 1]) l--;
                    }
                    else{
                        ans.add(new ArrayList<>(List.of(nums[i] , nums[j] , nums[k] , nums[l])));
                        
                        k++;
                        while(k < l && nums[k] == nums[k - 1]) k++;

                        l--;
                        while(k < l && nums[l] == nums[l + 1]) l--;
                    }
                }

                j++;
                while(j < nums.length && nums[j] == nums[j - 1]) j++;
            }

            i++;
            while(i < nums.length && nums[i] == nums[i - 1]) i++;
        }

        return ans;
    }
}