// 15 - 3Sum

import java.util.*;

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int i = 0, j = 0, k = 0;

        while(i < nums.length){
            j = i + 1;
            k = nums.length - 1;

            while(j < k){

                int val = nums[i] + nums[j] + nums[k];

                if(val < 0){
                    j++;
                    while(j < k &&nums[j] == nums[j - 1]) j++;
                }
                else if(val > 0){
                    k--;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
                else{
                    ans.add(new ArrayList<>(List.of(nums[i] , nums[j] , nums[k])));

                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[ k + 1]) k--;
                }
            }

            i++;
            while(i < nums.length && nums[i] == nums[i - 1]) i++;
        }

        return ans;
    }
}