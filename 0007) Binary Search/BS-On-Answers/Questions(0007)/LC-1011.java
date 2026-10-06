// 1011 - Capacity To Ship Packages Within D Days

class Solution1011 {
    public int shipWithinDays(int[] weights, int days) {

        int max = 0, sum = 0;

        for(int i = 0; i < weights.length; i++){
            max = Math.max(max , weights[i]);
            sum += weights[i];
        }

        int low = max, high = sum;

        while(low <= high){

            int mid = (low + high) / 2;

            if(noOfDays(weights , mid) <= days) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    public int noOfDays(int[] nums, int limit){

        int days = 0, weight = 0;

        for(int i = 0; i < nums.length; i++){

            if(weight + nums[i] > limit){
                days++;
                weight = nums[i];
            }
            else weight += nums[i];
        }

        if(weight != 0) days++;

        return days;
    }
}