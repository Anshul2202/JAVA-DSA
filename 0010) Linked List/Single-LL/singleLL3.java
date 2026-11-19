// Insertion in LL
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

public class singleLL3 {
    
    public static void printLL(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

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

    // Insertion At Head
    public static Node insertHead(Node head, int val){
        Node newHead = new Node(val, head);
        return newHead;
    }

    // Insertion At Tail
    public static Node insertTail(Node head, int val){

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        Node newTail = new Node(val);
        temp.next = newTail;

        return head;
    }

    // Insert At kth Position
    public static Node insertK(Node head, int val, int k){

        Node temp = head, prev = null;
        int cnt = 0;

        while(temp != null){
            cnt++;

            if(cnt == k){
                Node newNode = new Node(val, temp);
                prev.next = newNode;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    // Insertion Before Val
    public static Node insertBeforeVal(Node head, int val, int x){

        Node temp = head, prev = null;

        while(temp != null){

            if(temp.data == x){

                Node newNode = new Node(val, temp);
                prev.next = newNode;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String args[]){

        int[] arr = {1, 3, 4, 5, 9, 10, 14};
        
        Node head = convertArr2LL(arr);
        printLL(head);

        // Insertion At Head
        head = insertHead(head, 0);
        printLL(head);

        // Insertion At Tail
        head = insertTail(head, 20);
        printLL(head);

        // Insert At kth Position
        insertK(head, 21, 5);
        printLL(head);

        // Insertion Before Value
        insertBeforeVal(head, 19, 21);
        printLL(head);

    }
}
