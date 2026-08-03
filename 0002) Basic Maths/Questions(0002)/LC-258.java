// 258 - Add Digits

class Solution258 {
    public int addDigits(int num) {

        int sum = 0;
        int temp = num;

        while(num > 9){
            sum += temp % 10;
            temp /= 10;

            if( temp == 0){
                num = sum;
                temp = sum;
                sum = 0;
            }
        }

        return num;
    }
}