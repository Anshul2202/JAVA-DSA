// Lower Bound is the smallest idx for which nums[idx] >= x

public class LowerBound{

    public static void main(String arr[]){

        int[] nums = {1, 2, 5, 6, 7, 10, 12, 13, 17};

        int lb = lowerBound(nums, 10);

        System.out.println("Lower Bound for 10 is -> " + lb);
    }

    public static int lowerBound(int[] nums, int x){

        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){

            int mid = (low + high) / 2;

            if(nums[mid] < x){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }
}
