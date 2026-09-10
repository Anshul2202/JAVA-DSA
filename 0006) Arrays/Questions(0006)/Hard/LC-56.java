// 56 - Merge Intervals

import java.util.*;

class Solution56{
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Arrays::compare);

        List<List<Integer>> list = new ArrayList<>();

        int start = intervals[0][0], end = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++){

            if(intervals[i][0] <= end){

                if(intervals[i][1] > end) end = intervals[i][1];
            }
            else{
               list.add(new ArrayList<>(List.of(start , end)));
               start = intervals[i][0];
               end = intervals[i][1]; 
            }
        }

        list.add(new ArrayList<>(List.of(start , end)));

        int[][] ans = new int[list.size()][];

        for(int i = 0; i < list.size(); i++){

            ans[i] = new int[list.get(i).size()];

            for(int j = 0; j < list.get(i).size(); j++){
                ans[i][j] = list.get(i).get(j);
            }
        }

        return ans;
    }
}