// 8 - String to Integer (atoi)

class Solution8 {
    public int myAtoi(String s) {
        s = s.trim();

        if(s.length() == 0) return 0;

        long result = 0;

        int sign = 1, startIdx = 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            startIdx = 1;
        }
        else if(s.charAt(0) == '+') startIdx = 1;

        for(int i = startIdx; i < s.length(); i++){

            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9'){

                int val = ch - '0';

                if(result > Integer.MAX_VALUE / 10){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                if(result == Integer.MAX_VALUE / 10 && val > (sign == 1 ? 7 : 8)){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result *= 10;
                result += val;
            }
            else break;

        }

        return (int) result * sign;


    }
}