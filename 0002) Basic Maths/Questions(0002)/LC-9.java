// LC9 - Palindrome Number

class Solution9 {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int value = x;
        while(x > 0){
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if(rev == value){
            return true;
        }
        else{
            return false;
        }
    }
}

