// 875 - Koko Eating Bananas

class Solution875 {
    public int minEatingSpeed(int[] piles, int h) {
        
        long max = piles[0];

        for(int i = 1; i < piles.length; i++){
            max = Math.max(max , piles[i]);
        }

        long low = 1, high = max;
        int ans = -1;

        while(low <= high){

            long mid = (low + high) / 2;

            if(totalHrs(piles , mid) <= h){
                ans = (int) mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return ans;
    }

    public long totalHrs(int[] nums, long n){
        long hrs = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] % n == 0) hrs += nums[i]/n;
            else hrs += nums[i]/n + 1;
        }

        return hrs;
    }
}