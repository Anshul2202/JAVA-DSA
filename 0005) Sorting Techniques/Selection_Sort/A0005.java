class A0005{

    public static void main(String arr[]){

        int[] nums ={34 , 16 , 90 , 94, 18 , 9 , 7 , 3, 7 , 69};

        selection_sort(nums);

        for(int i : nums){
            System.out.println(i);
        }
    }

    public static void selection_sort(int[] a){

        for(int i = 0; i < a.length - 1; i++){

            int minIdx = i;

            for(int j = i; j < a.length; j++){
                if(a[j] < a[minIdx]) minIdx = j;
            }

            int temp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = temp;
        }
    }
}