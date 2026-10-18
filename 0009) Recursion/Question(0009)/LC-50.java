// 50 - Pow(x, n)

class Solution50 {
    public double myPow(double x, int n) {
        
        long power = n;

        if(n < 0){
            return 1/getPow(x , -power);
        }
        return getPow(x , power);
        
    }

    public double getPow(double x, long n){

        if(n == 0) return 1;

        double val = getPow(x , n/2);

        if(n % 2 == 0){
            return val * val;
        }
        return val * val * x;
    }
}