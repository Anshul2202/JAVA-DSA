// 13 - Roman to Integer

class Solution13 {
    public int romanToInt(String s) {

        int result = 0;
        int val = 0, prev = 0;

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(ch == 'I') val = 1;
            else if(ch == 'V') val = 5;
            else if(ch == 'X') val = 10;
            else if(ch == 'L') val = 50;
            else if(ch == 'C') val = 100;
            else if(ch == 'D') val = 500;
            else val = 1000;

            if(val <= prev) {
                result += val;
                prev = val;
            }
            else{
                result -= prev;
                result += val - prev;
                prev = val;
            }
        }

        return result;
    }
}