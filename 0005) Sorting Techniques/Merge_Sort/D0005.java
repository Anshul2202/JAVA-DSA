class D0005{

    public static void main(String arr[]){


    }

    public static void MergeSort(int[] arr, int low, int high){

        if(low == high) return;

        int mid = (low + high)/2;

        MergeSort(arr , low , mid);
        MergeSort(arr , mid + 1, high);

        // Merge(arr , low , mid , high);
    }
}