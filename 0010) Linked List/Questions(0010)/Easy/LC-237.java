// 237 - Delete Node in a Linked List


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution237 {
    public void deleteNode(ListNode node) {
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}