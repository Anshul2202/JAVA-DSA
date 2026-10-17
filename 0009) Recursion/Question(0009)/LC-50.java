// 50 - Pow(x, n)

class Solution50{
    public double myPow(double x, int n) {

        long power = n;
        double ans = 1;

        if(n < 0) power = -power;

        while(power > 0){

            if(power % 2 != 0){
                ans *= x;
                power = power - 1;
            }
            else{
                x = x * x;
                power /= 2;
            }
        }

        if(n < 0) return 1 / ans;
        return ans;
    }
}