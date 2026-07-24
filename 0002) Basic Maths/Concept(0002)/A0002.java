public class A0002 {
    
    public static void main(String arr[]){

        // Extraction Of Digits
        int digit = 123;

        while(digit > 0){
            System.out.println(digit % 10);

            digit /= 10;
        }
    }
}
