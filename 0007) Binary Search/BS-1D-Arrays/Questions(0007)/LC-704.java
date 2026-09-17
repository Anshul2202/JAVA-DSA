// 704 - Binary Search

// Iterative Solution

class Solution704A {
    public int search(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }
}


// Recursive Solution

class Solution704B {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int low, int high, int target){

        if(low > high) return -1;

        int mid = (low + high) / 2;

        if(nums[mid] == target) return mid;
        else if(nums[mid] > target){
            return binarySearch(nums, low, mid - 1, target);
        }
        else{
            return binarySearch(nums, mid + 1, high, target);
        }
    }
}