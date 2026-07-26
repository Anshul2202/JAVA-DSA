public class A0003 {
    
    public static void main(String arr[]){
        print();
    }

    static int count = 0;
    public static void print(){

        // Base Condition
        if(count == 4) return;


        System.out.println(count);
        count++;
        print(); // ---> Recursive call
    }
}
