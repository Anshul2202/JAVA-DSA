// 1011 - Capacity To Ship Packages Within D Days

class Solution1011 {
    public int shipWithinDays(int[] weights, int days) {
        
        int max = 0 , min = weights[0];
        for(int i = 0; i < weights.length; i++){
            max += weights[i];
            min = Math.max(min , weights[i]);
        }

        int low = min, high = max;

        while(low <= high){

            int mid = (low + high) / 2;

            if(noOfDays(weights , mid) <= days) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    public int noOfDays(int[] nums, int capacity){

        int weight = 0, day = 0;
        for(int i = 0; i < nums.length; i++){
            weight += nums[i];

            if(weight == capacity){
                day++;
                weight = 0;
            }
            else if(weight > capacity){
                day++;
                weight = nums[i];
            }
        }

        if(weight != 0) day++;

        return day;
    }
}