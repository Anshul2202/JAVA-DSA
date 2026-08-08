// 50 - Pow(x, n)

class Solution {
    public double myPow(double x, int n) {
        
        if(n >= 0){
            return myFunc(x , (long)n);
        }
        else{
            return 1 / myFunc(x , Math.abs((long)n));
        }
    }

    public double myFunc(double x ,long n){

        if(n == 0) return 1;

        if(n % 2 == 0){
            double half = myFunc(x , n/2);
            return half * half;
        }
        else{
            return x * myFunc(x , n - 1);
        }
    }
}