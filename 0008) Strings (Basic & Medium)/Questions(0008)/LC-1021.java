// 1021 - Remove Outermost Parentheses

class Solution1021 {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();
        int cnt = 0, start = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(') cnt++;
            else cnt--;

            if(cnt == 0){
                sb.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }

        return sb.toString();
    }
}