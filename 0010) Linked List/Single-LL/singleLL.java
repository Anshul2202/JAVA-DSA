// My Custom Data-type
class Node{

    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class singleLL{

    public static Node convertArr2LL(int[] arr){

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static int getCnt(Node head){

        Node temp = head;
        int cnt = 0;

        while(temp != null){
            temp = temp.next;
            cnt++;
        }

        return cnt;
    }

    public static void isPresent(Node head, int val){

        Node temp = head;

        while(temp != null){
            if(temp.data == val){
                System.out.println(val + " is present");
                return;
            }
            temp = temp.next;
        }

        System.out.println(val + " is Not present");
    }
    
    public static void main(String[] arr){
        
        int[] nums = {3, 12, 13, 54, 94};

        Node head = convertArr2LL(nums);

        // Treversal in LL
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Count El in LL
        int cnt = getCnt(head);
        System.out.println("\n" + cnt);

        // Search for El in LL
        isPresent(head, 13);
    }
}