// 118 - Pascal's Triangle

import java.util.*;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){
            list.add(generateRow(i));
        }
        
        return list;
    }

    public List<Integer> generateRow(int n){

        List<Integer> tempList = new ArrayList<>();

        int el = 1;
        tempList.add(el);

        for(int i = 1; i < n; i++){
            el *= n - i;
            el /= i;

            tempList.add(el);
        }

        return tempList;
    }
}