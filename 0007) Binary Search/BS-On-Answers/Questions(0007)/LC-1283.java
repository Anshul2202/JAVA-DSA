// 1283 - Find the Smallest Divisor Given a Threshold

class Solution1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            max = Math.max(max , nums[i]);
        }

        int low = 1, high = max;
        int ans = max;

        while(low <= high){

            int mid = (low + high) / 2;

            if(getSum(nums , mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return ans;
    }

    public int getSum(int[] nums, int n){

        int sum = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] % n == 0) sum += nums[i]/n;
            else sum += nums[i]/n + 1;
        }

        return sum;
    }
}