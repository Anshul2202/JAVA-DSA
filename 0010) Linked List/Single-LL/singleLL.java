// Custom Data type
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

public class singleLL {
    public static void main(String[] args) {
      
      int[] arr = {12, 6, 7, 11, 1, 3, 5};

      Node head = convertArr2LL(arr);

      // Treversal In LL
      Node temp = head;

      while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
      }

      // Lenght of LL
      int len = getLength(head);
      System.out.println("Length of LL : " + len);

      // Search El in LL
      isPresent(head, 13);
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

    public static int getLength(Node head){

      Node temp = head;
      int cnt = 0;

      while(temp != null){
        cnt++;
        temp = temp.next;
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


}