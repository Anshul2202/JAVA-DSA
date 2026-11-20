// 203 - Remove Linked List Elements

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution203 {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return head;
        
        if(head.val == val){
            head = head.next;
            return removeElements(head, val);
        }

        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){

            if(temp.val == val){
                prev.next = temp.next;
                temp = temp.next;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}