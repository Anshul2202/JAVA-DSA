// 410 - Split Array Largest Sum

class Solution410 {
    public int splitArray(int[] nums, int k) {
        
        int max = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(max , nums[i]);
        }

        int low = max, high = sum;

        while(low <= high){

            int mid = (low + high) / 2;

            if(noOfStudents(nums, mid) <= k) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    public int noOfStudents(int[] nums, int limit){

        int stu = 1, pages = 0;

        for(int i = 0; i < nums.length; i++){
            
            if(pages + nums[i] > limit){
                stu++;
                pages = nums[i];
            }
            else pages += nums[i];
        }

        return stu;
    }
}