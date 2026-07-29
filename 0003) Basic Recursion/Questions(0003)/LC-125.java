// 125 - Valid Palindrome

class Solution125 {
    public boolean isPalindrome(String s) {
        return checkPalindrome(0, s.length() - 1, s.toLowerCase());
    }

    public boolean checkPalindrome(int left, int right , String str){

        if(left >= right) return true;

        if((str.charAt(left) + "").matches("\\W|_")) return checkPalindrome(left + 1, right , str);

        if((str.charAt(right) + "").matches("\\W|_")) return checkPalindrome(left , right - 1 , str);

        if(str.charAt(left) != str.charAt(right)) return false;

        return checkPalindrome(left + 1 , right - 1 , str);
    }
}