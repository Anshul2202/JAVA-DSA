// 231 - Power of Two

class Solution231 {
    public boolean isPowerOfTwo(int n) {

        if(n < 1) return false;

        return myFunc(n);
        
    }

    public boolean myFunc(int x){

        if(x == 1) return true;

        if(x % 2 != 0) return false;

        return myFunc(x/2);
    }
}