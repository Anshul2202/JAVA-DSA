// 912 - Sort an Array

import java.util.*;

class Solution912 {
    public int[] sortArray(int[] nums) {

        MergeSort(nums , 0, nums.length -1);
        return nums;
    }

    public void MergeSort(int[] arr, int low , int high){

        // Base Cdn
        if(low == high) return;

        int mid = (high + low) / 2;

        MergeSort(arr , low , mid);
        MergeSort(arr , mid + 1, high);

        Merge(arr , low , mid , high);
    }

    public void Merge(int[] arr, int low ,int mid , int high){

        ArrayList<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){

            if(arr[left] < arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }


        while(left <= mid){
            list.add(arr[left]);
            left++;
        }

        while(right <= high){
            list.add(arr[right]);
            right++;
        }

        for(int i =low; i <= high; i++){
            arr[i] = list.get(i - low);
        }
    }
}