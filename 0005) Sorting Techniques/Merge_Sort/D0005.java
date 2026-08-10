import java.util.*;

class D0005{

    public static void main(String arr[]){

        int[] nums ={34 , 16 , 90 , 94, 18 , 9 , 7 , 3, 7 , 69 , 13};

        MergeSort(nums , 0 , nums.length - 1);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }

    public static void MergeSort(int[] a , int low , int high){

        //Base Cdn
        if(high == low) return;

        int mid = (high + low) / 2;

        MergeSort(a , low , mid);
        MergeSort(a , mid + 1, high);

        Merge(a, low ,mid , high);
    }

    public static void Merge(int[] a, int low, int mid, int high){

        ArrayList<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){

            if(a[left] < a[right]){
                list.add(a[left]);
                left++;
            }
            else{
                list.add(a[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(a[left]);
            left++;
        }

        while(right <= high){
            list.add(a[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            a[i] = list.get(i - low);
        }
    }
}