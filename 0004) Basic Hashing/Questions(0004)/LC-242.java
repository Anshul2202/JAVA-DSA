// 242 - Valid Anagram

class Solution242 {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] hashArrT = new int[256];
        int[] hashArrS = new int[256];

        for(int i = 0; i < s.length(); i++){
            hashArrT[t.charAt(i)] += 1;
            hashArrS[s.charAt(i)] += 1;
        }

        for(int i = 0; i < s.length(); i++){
            
            if(hashArrS[s.charAt(i)] != hashArrT[s.charAt(i)]) return false;
        }

        return true;
    }
}