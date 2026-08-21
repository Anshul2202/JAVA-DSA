// 599 - Minimum Index Sum of Two Lists

import java.util.*;

class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String , Integer> map = new HashMap<>();

        int minSum = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i] , i);
        }

        for(int i = 0; i < list2.length; i++){

            if(map.containsKey(list2[i])){

                int sum = map.get(list2[i]) + i;

                if(sum == minSum){
                    list.add(list2[i]);
                }

                if(sum < minSum){
                    list.clear();

                    list.add(list2[i]);
                    minSum = sum;
                }
            }
        }

        String[] result = new String[list.size()];

        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}