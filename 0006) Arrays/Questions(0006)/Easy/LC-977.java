package Easy;
// 977 - Squares of a Sorted Array

import java.util.*;

class Solution977 {
    public int[] sortedSquares(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        MergeSort(nums , 0 , nums.length - 1);
        
        return nums;
    }

    
    public void MergeSort(int[] nums , int low, int high){

        if(low == high) return;

        int mid = (low + high)/2;

        MergeSort(nums, low , mid);
        MergeSort(nums, mid + 1, high);

        Merge(nums, low , mid , high);
    }

    public void Merge(int[] nums, int low , int mid , int high){

        int i = low; 
        int j = mid + 1;

        ArrayList<Integer> list = new ArrayList<>();

        while(i <= mid && j <= high){

            if(nums[i] < nums[j]){
                list.add(nums[i]);
                i++;
            }
            else{
                list.add(nums[j]);
                j++;
            }
        }

        while(i <= mid){
            list.add(nums[i]);
            i++;
        }

        while(j <= high){
            list.add(nums[j]);
            j++;
        }

        for(int k = low; k <= high; k++){
            nums[k] = list.get(k - low);
        }
    }
}