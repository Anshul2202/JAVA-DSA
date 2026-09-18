// Upper Bound is the smallest idx for which --> nums[idx] > x

class UpperBound{

    public static void main(String arr[]){

        int[] nums = {1, 2, 5, 6, 7, 10, 12, 13, 17};

        int ub = upperBound(nums, 10);

        System.out.println("Upper Bound for 10 is -> " + ub);

    }

    public static int upperBound(int[] nums, int x){

        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            
            int mid = (low + high) / 2;

            if(nums[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return ans;
    }
}