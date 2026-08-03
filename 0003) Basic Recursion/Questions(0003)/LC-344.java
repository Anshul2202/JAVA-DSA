// 344 - Reverse String

class Solution344 {
    public void reverseString(char[] s) {
        myRevStr(0 , s);
    }

    public void myRevStr(int i, char[] str){

        if(i >= str.length/2) return;

        char temp = str[i];
        str[i] = str[str.length - i - 1];
        str[str.length - i - 1] = temp;

        myRevStr(i+1 , str);
    }
}