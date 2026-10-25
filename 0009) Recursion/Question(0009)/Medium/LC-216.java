// 216 - Combination Sum III

import java.util.*;

class Solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<>();

        getComb(1, n, new ArrayList<>(), k, res);

        return res;
    }

    public void getComb(int val, int target, List<Integer> list, int k, List<List<Integer>> res) {

        if(val > 9) {
            if(target == 0 && list.size() == k) res.add(new ArrayList<>(list));
            return;
        }

        list.add(val); 
        getComb(val + 1, target - val, list, k, res);

        list.remove(list.size() - 1);
        getComb(val + 1, target, list, k, res);
    }
}