class C0005{

    public static void main(String arr[]){

    int[] nums ={34 , 16 , 90 , 94, 18 , 9 , 7 , 3, 7 , 69};

    Insertion_Sort(nums);

    for(int i : nums){
        System.out.println(i);
    }
    }

    public static void Insertion_Sort(int a[]){

        for(int i = 0; i < a.length - 1; i++){

            int j = i;

            while(j > 0 && a[j - 1] > a[j]){

                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;

                j--;
            }
        }
    }
}