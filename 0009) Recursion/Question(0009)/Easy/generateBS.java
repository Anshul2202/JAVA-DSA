// Generate Binary Strings Without Consecutive 1s

import java.util.*;

class generateBSSol {
    public List<String> generateBinaryStrings(int n) {
        
        List<String> result = new ArrayList<>();

        generateBS(0 , n , new StringBuilder(), result);

        return result;
    }

    public void generateBS(int idx, int n, StringBuilder sb, List<String> result){

        if(idx == n){

            for(int i = 0; i < sb.length() - 1; i++){
                if(sb.charAt(i) == '1' && sb.charAt(i + 1) == '1') return; 
            }

            result.add(sb.toString());
            return;
        }

        sb.append(0);
        generateBS(idx + 1, n, sb, result);
        sb.deleteCharAt(sb.length() - 1);
        
        sb.append(1);
        generateBS(idx + 1, n, sb, result);
        sb.deleteCharAt(sb.length() - 1);
    }
}