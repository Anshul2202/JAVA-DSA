// 118 - Pascal's Triangle

import java.util.*;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ansList = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){
            ansList.add(generateRow(i));
        }

        return ansList;
        
    }

    public List<Integer> generateRow(int n){

        List<Integer> list = new ArrayList<>();

        int ans = 1;
        list.add(ans);

        for(int i = 1; i < n; i++){
            ans *= n - i;
            ans /= i;

            list.add(ans);
        }

        return list;
    }
}