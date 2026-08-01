class B0004{

    public static void main(String arr[]){

        // Character hashing (Using array)

        String str = "abcdahfirAdCDAAasalndvsnfFSDFAFDkndfkADFfdkskFsfSDFsdFFdsfnkdjrFDSFnfdksfks";

        // Pre Computation
        int[] hashArr = new int[256];

        for(int i = 0; i < str.length(); i++){
            hashArr[str.charAt(i)] += 1;
        }

        // ---------------------------------------------

        // Fetching
        char[] check = {'a' , 'A' , 's' , 'C' , 'D' , 'e'};

        for(int i = 0; i < check.length; i++){
            System.out.println(check[i] + " is present " + hashArr[check[i]] + " times");
        }



    }
}