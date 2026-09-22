// 153 - Find Minimum in Rotated Sorted Array

class Solution153 {
    public int findMin(int[] nums) {
        
        int low = 0, high = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while(low <= high){

            int mid = (low + high) / 2;

            if(nums[low] <= nums[mid]){
                min = Math.min(min , nums[low]);
                low = mid + 1;
            }
            else{
                min = Math.min(min , nums[mid]);
                high = mid - 1;
            }
        }

        return min;
    }
}