// 367 - Valid Perfect Square

class Solution367 {
    public boolean isPerfectSquare(int num) {
        
        int low = 0 , high = 0;

        if(num > 1) high = num / 2;
        else return true;
        
        while(low <= high){

            int mid = (low + high) / 2;

            if(mid == 0) return false;

            if((long) mid * mid == num) return true;
            else if((long) mid * mid < num) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
}