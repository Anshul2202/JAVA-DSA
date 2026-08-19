package Easy;
// 189 - Rotate Array

class Solution189 {
    public void rotate(int[] nums, int k) {

        k %= nums.length;

        if (k == 0) return;

        reverseArr(nums , nums.length - k, nums.length - 1); 
        reverseArr(nums , 0 , nums.length - k - 1);
        reverseArr(nums, 0, nums.length - 1);
    }

    public void reverseArr(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}