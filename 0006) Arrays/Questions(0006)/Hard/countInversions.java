// Count Inversions

import java.util.*;

public class countInversions{

    static int cnt = 0;

    public static void main(String[] args) {
      int[] nums = {5,1,8,3,9,12,7,10,1};

      mergeSort(nums , 0 , nums.length - 1);

      for(int i = 0; i < nums.length; i++){
        System.out.print(nums[i] + " ");
      }

      System.out.println("\n" + cnt);
    }

    public static void mergeSort(int[] nums, int low , int high){

      if(low == high) return;

      int mid = (low + high) / 2;

      mergeSort(nums , low , mid);
      mergeSort(nums , mid + 1 , high);

      merge(nums, low , mid , high);
    }

    public static void merge(int[] nums, int low, int mid , int high){

      List<Integer> list = new ArrayList<>();

      int left = low;
      int right = mid + 1;

      while(left <= mid && right <= high){

        if(nums[left] <= nums[right]){
          list.add(nums[left]);
          left++;
        }
        else{
          cnt += (mid - left + 1);
          list.add(nums[right]);
          right++;
        }
      }

      while(left <= mid) list.add(nums[left++]);

      while(right <= high) list.add(nums[right++]);

      
      for(int i = low; i <= high; i++){
        nums[i] = list.get(i - low);
      }

    }
}