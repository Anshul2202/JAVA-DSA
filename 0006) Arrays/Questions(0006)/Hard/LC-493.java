// 493 - Reverse Pairs

import java.util.*;

class Solution493 {

    int cnt = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0 , nums.length - 1);

        return cnt;
    }

    public void mergeSort(int[] nums, int low, int high){

        if(low == high) return;

        int mid = (low + high) / 2;

        mergeSort(nums, low , mid);
        mergeSort(nums, mid + 1, high);

        countPairs(nums , low, mid, high);

        merge(nums, low, mid, high);
    }

    public void countPairs(int[] nums, int low, int mid, int high){

        int right = mid + 1;

        for(int i = low; i <= mid; i++){

            while(right <= high && nums[i] > (long) nums[right] * 2) right++;

            cnt += right - (mid + 1);
        }
    }

    public void merge(int[] nums, int low, int mid, int high){

        List<Integer> list = new ArrayList<>();

        int i = low, j = mid + 1;

        while(i <= mid && j <= high){

            if(nums[i] < nums[j]) list.add(nums[i++]);
            else list.add(nums[j++]);
        }

        while(i <= mid) list.add(nums[i++]);

        while(j <= high) list.add(nums[j++]);

        for(int k = low; k <= high; k++){
            nums[k] = list.get(k - low);
        }
    }
}