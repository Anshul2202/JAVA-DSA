// 2520 - Count the Digits That Divide a Number

class Solution2520 {
    public int countDigits(int num) {
        
        int tempVal = num;
        int count = 0;

        while(tempVal > 0){

            if(num % (tempVal % 10) == 0) count++;

            tempVal /= 10;
        }

        return count;
    }
}