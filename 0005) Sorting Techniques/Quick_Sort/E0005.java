class E0005{

    public static void main(String arr[]){

        int[] nums ={34 , 16 , 90 , 94, 18 , 9 , 7 , 3, 7 , 69 , 13};

        QuickSort(nums , 0 , nums.length -1 );

        for(int i : nums){
            System.out.println(i);
        }
    }

    public static void QuickSort(int[] nums, int low, int high){
        
        if(low < high){
            int pivotIdx = getPivot(nums, low, high);

            QuickSort(nums, low , pivotIdx - 1);
            QuickSort(nums , pivotIdx + 1, high);
        }
    }


    public static int getPivot(int[] nums, int low , int high){

        int pivotVal = nums[low];
        int i = low;
        int j = high;

        while(i < j){

            while(nums[i] <= pivotVal && i < high) i++;

            while(nums[j] > pivotVal && j > low) j--;

            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        nums[low] = nums[j];
        nums[j] = pivotVal;

        return j;
    }
}