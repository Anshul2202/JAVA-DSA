// 88 - Merge Sorted Array

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = 0; i < nums2.length; i++){
            nums1[m + i] = nums2[i]; 
        }

        sort(nums1);

    }

    
    public void sort(int arr[]){

        for(int i = 0; i < arr.length - 1; i++){

            boolean didSwap = false;

            for(int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }

            if(!didSwap){
                break;
            }
        }
    }

    
}