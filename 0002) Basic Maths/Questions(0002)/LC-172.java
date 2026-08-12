// 172 - Factorial Trailing Zeroes

class Solution172 {
    public int trailingZeroes(int n) {

        int count = 0;
        
        for(int i = 1; i <= n; i++){

            if(i % 5 == 0){

                int temp = i;

                while(temp % 5 == 0){
                    count++;
                    temp /= 5;
                }
            }
        }

        return count;
    }
}