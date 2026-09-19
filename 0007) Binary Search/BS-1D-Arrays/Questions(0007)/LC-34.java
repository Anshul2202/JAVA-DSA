// 34 - Find First and Last Position of Element in Sorted Array

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        
        int low = 0, high = nums.length - 1;
        int first = -1, last = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        if(first == -1) return new int[]{-1 , -1};

        low = 0;
        high = nums.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(nums[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return new int[]{first , last};

    }
}