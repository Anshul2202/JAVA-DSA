class B0005{
    public static void main(String arr[]){

    int[] nums ={34 , 16 , 90 , 94, 18 , 9 , 7 , 3, 7 , 69};

    bubble_Sort(nums);

    for(int i : nums){
        System.out.println(i);
    }
    }

    public static void bubble_Sort(int[] a){

        for(int i = 0; i < a.length - 1; i++){

            boolean didSwap = false;

            for(int j = 0; j < a.length - i - 1; j++){

                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    didSwap = true;
                }
            }

            if(!didSwap) break;
        }
    }
}