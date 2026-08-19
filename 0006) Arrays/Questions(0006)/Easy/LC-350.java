// 350 - Intersection of Two Arrays II

import java.util.*;

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i < nums1.length && j < nums2.length){

            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) i++;
            else j++;
        }

        int[] ans = new int[list.size()];

        int idx = 0;

        for(int k : list){
            ans[idx] = k;
            idx++;
        }

        return ans;
    }
}