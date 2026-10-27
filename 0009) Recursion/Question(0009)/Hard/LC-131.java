// 131 - Palindrome Partitioning

import java.util.*;

class Solution131 {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<>();

        getSubStr(0, s, new ArrayList<>(), res);

        return res;
    }

    public void getSubStr(int idx, String s, List<String> list, List<List<String>> res){

        if(idx == s.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx; i < s.length(); i++){

            if(isPalindrome(s, idx, i)){
                list.add(s.substring(idx, i + 1));
                getSubStr(i + 1, s, list, res);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end){

        while(start <= end){

            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}