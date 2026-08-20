// 1207 - Unique Number of Occurrences

import java.util.*;

class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer , Integer> map = new HashMap<>();

        HashSet<Integer> fqSet = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }

        for(int i = 0; i < arr.length; i++){
            fqSet.add(map.get(arr[i]));
        }

        if(fqSet.size() == map.size()) return true;
        else return false;
    }
}