class A0004 {
    
    public static void main(String arr[]){

        // Number Hashing (Using Array)
        int[] nums = {1 , 3 , 2 , 1 , 5 , 6 , 8 , 12 , 3 , 1};


        // Let's Suppose the max valued num can be 12

        // ----------------------------------------------
        // Pre - Computation

        int[] hashArr = new int[12 + 1];

        for(int i = 0; i < nums.length; i++){
            hashArr[nums[i]] += 1;
        }

        // ----------------------------------------------
        // Fetching 

        for(int i = 0; i < nums.length; i++){
            System.out.println(hashArr[nums[i]]);
        }
    }
}
