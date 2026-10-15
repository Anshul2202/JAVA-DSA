// 1614 - Maximum Nesting Depth of the Parentheses

class Solution1614 {
    public int maxDepth(String s) {

        int k = 0, max = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                k++;
                max = Math.max(k , max);
            }
            else if(ch == ')') k--;
        }

        return max;
    }
}