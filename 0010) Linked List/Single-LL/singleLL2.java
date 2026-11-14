// Deletion In LL

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class singleLL2 {

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

    public static void printLL(Node head){
        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Delete Head
    public static Node deleteHead(Node head){

        if(head.next == null) return null;

        head = head.next;
        return head;
    }

    // Delete Tail
    public static Node deleteTail(Node head){

        if(head.next == null) return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    // Delete Kth El
    public static Node deleteKthEl(Node head, int k){

        if(k == 1){
            head = deleteHead(head);
            return head;
        }

        Node temp = head, prev = null;
        int cnt = 0;

        while(temp != null){
            cnt++;

            if(cnt == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    // Delete Value
    public static Node deleteVal(Node head, int val){

        Node temp = head, prev = null;

        while(temp != null){

            if(temp.data == val){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args){

        int[] arr = {12 ,6 , 3, 5, 1, 6 ,8, 0, 7, 5, 3};
        Node head = convertArr2LL(arr);
        
        printLL(head);

        // Deletion Of Head
        head = deleteHead(head);
        printLL(head);

        // Deletion Of Tail
        head = deleteTail(head);
        printLL(head);

        // Deletion Of kth El
        head = deleteKthEl(head, 1);
        printLL(head);

        // Deletion Of Val
        head = deleteVal(head, 5);
        printLL(head);

    }
    
}
