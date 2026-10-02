// Aggressive Cows

import java.util.*;

class aggressiveCowsSol {
    public int aggressiveCows(int[] nums, int k) {
       
       Arrays.sort(nums);

       int low = 1, high = nums[nums.length - 1] - nums[0];
       
       while(low <= high){

        int mid = (low + high) / 2;

        if(noOfCows(nums , mid) >= k) low = mid + 1;
        else high = mid - 1;
       }

       return high;
    }

    public int noOfCows(int[] nums, int limit){

        int cowCnt = 1, last = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(nums[i] - last >= limit){
                cowCnt++;
                last = nums[i];
            }
        }

        return cowCnt;
    }
}
