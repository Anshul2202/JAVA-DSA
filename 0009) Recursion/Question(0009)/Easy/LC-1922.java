// 1922 - Count Good Numbers

class Solution1922 {
    public int countGoodNumbers(long n) {

        long even = (n + 1)/2;
        long odd = n/2;

        int M = 1000000007;

        long ans = (long) getPow(5 , even) * getPow(4 , odd) % M;

        return (int) ans;
    }

    public int getPow(int x, long n){

        if(n == 0) return 1;

        int M = 1000000007;

        long val = getPow(x , n/2);

        if(n % 2 == 0){
            return (int) ((val * val) % M);
        }
        return (int) ((val * val * x) % M);

    }
}