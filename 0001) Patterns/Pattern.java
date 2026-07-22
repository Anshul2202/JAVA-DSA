class Pattern{
    
    public static void main(String arr[]){

        // Pattern 1
        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 2
        for(int i = 0; i < 5; i++){

            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 3
        for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 4
        for(int i = 1; i <= 5; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 5
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < (5 - i); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ----------------------------------

        // Pattern 6
        for(int i = 0; i < 5; i++){

            for(int j = 1; j <= (5 - i); j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 7
        for(int i = 0; i < 5; i++){

            // space
            for(int j = 0; j < (5 - i - 1); j++){
                System.out.print(" ");
            }

            // star
            for(int j = 0; j < (2*i + 1); j++){
                System.out.print("*");
            }

            // space
            for(int j = 0; j < (5 - i - 1); j++){
                System.out.print(" ");
            }
            System.out.println();


        }

        // -------------------------------------------

        // Pattern 8
        for(int i = 0; i < 5; i++){

            // space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            // star
            for(int j = 0; j < (2*5 - 2*i - 1); j++){
                System.out.print("*");
            }

            // space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        // --------------------------------------------

        // Pattern 9
        // (pattern 7 + pattern 8) Code

        // --------------------------------------------

        // Pattern 10
        int val = 0;
        for(int i = 0; i < (2*5 - 1); i++){
            
            if(i < 5){
                val++;
            }
            else{
                val--;
            }

            for(int j = 0; j < val; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ---------------------------------------------

        // Pattern 11
        int val2 = 0;
        for(int i = 0; i < 5; i++){

            if(i % 2 == 0){
                val2 = 1;
            }
            else{
                val2 = 0;
            }

            for(int j = 0; j <= i; j++){
                System.out.print(val2);
                val2 = 1 - val2;
            }
            System.out.println();
        }

        // ---------------------------------------------

        // Pattern 12
        for(int i = 1; i <= 4; i++){

            // Num
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            

            // space
            for(int j = 1; j <= (2*4 - 2*i); j++){
                System.out.print(" ");
            }

            // Num
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();


        }

        // ----------------------------------------------

        // Pattern 13
        int count = 1;
        for(int i = 0; i < 5; i++){

            for(int j = 0; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        // -----------------------------------------------

        // Pattern 14
        for(int i = 0; i < 5; i++){

            for(int j = 0; j <= i; j++){
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }

        // -----------------------------------------------

        // Pattern 15
        int num = 0;
        for(int i = 0; i < 5; i++){

            num = 0;
            for(int j = 5; j > i; j--){
                System.out.print((char)('A' + num) + " ");
                num++;
            }
            System.out.println();
        }

        // ------------------------------------------------

        // Pattern 16
        for(int i = 0; i < 5; i++){

            for(int j = 0; j <= i; j++){
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }

        // -------------------------------------------------

        // Pattern 17
        int num2 = 0;
        boolean cdn = true;
        for(int i = 0; i < 5; i++){

            // space
            for(int j = 0; j < 5 - i - 1; j++){
                System.out.print(" ");
            }

            // char
            num2 = 0;
            cdn = true;
            for(int j = 0; j < (2*i + 1); j++){

                System.out.print((char)('A' + num2));

                if(num2 < (2*i)/2 && cdn) num2++;
                else {
                    num2--;
                    cdn = false;
                }
                
            }

            // space
            for(int j = 0; j < 5 - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        // -----------------------------------------------------

        // Pattern 18
        int ch = (int)'E';
        for(int i = 0; i <= 4; i++){

            ch = (int)'E';
            for(int j = 0; j <= i; j++){
                System.out.print((char)(ch - i));
                ch++;
            }
            System.out.println();
        }

        // --------------------------------------------------

        // Pattern 19
        for(int i = 0; i < 5; i++){

            // star
            for(int j = 5 - i; j > 0; j--){
                System.out.print("*");
            }
            
            // space
            for(int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }


            // star
            for(int j = 5 - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++){

            // star
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }

            // space
            for(int j = 0; j < (5 - 1 - i)*2; j++){
                System.out.print(" ");
            }

            // star
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // -------------------------------------------------

        // Pattern 20
        int row = 0;
        int space = 0;
        for(int i = 1; i <= 2*5 - 1; i++){

            if(i <= 5) {
                row = i;
                space = (5 - i)*2;
            }
            else{
                row = 2*5 - i;
                space += 2;
            }

            // star
            for(int j = 0; j < row; j++){
                System.out.print("*");
            }

            // space
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }

            // star
            for(int j = 0; j < row; j++){
                System.out.print("*");
            }
           
            System.out.println();
        }

        // ------------------------------------------------

        // Pattern 21
        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){

                if(i == 0 || i == 4 - 1 || j == 0 || j == 4 - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        // -------------------------------------------------

        // Pattern 22
        for(int i = 0; i < (2*4 - 1); i++){

            for(int j = 0; j <(2*4 - 1); j++){
                
                int top = i;
                int left = j;
                int bottom = (2*4 - 2) - i;
                int right = (2*4 - 2) - j;

                int value = 4 - Math.min(Math.min(top , left) , Math.min(bottom , right));
                System.out.print(value);
            }
            System.out.println();
        }
    }
}