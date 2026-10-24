// 216 - Combination Sum III

import java.util.*;

class Solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> res = new ArrayList<>();
        getSum(1, n, new ArrayList<>(), k, res);

        return res;
    }

    public void getSum(int val, int target, List<Integer> list, int size, List<List<Integer>> res){

        if(val > 9){
            if(list.size() == size && target == 0) res.add(new ArrayList<>(list));
            return;
        }

        list.add(val);
        getSum(val + 1, target - val, list, size, res);

        list.remove(list.size() - 1);
        getSum(val + 1, target, list, size, res);
    }
}