package leetcode;


import static leetcode.ReverseLinkedList.writeNodes;

public class SwapNodesInPairs {

    public static void main(String[] args) {
        ListNode node14 = new ListNode(4);
        ListNode node13 = new ListNode(3, node14);
        ListNode node12 = new ListNode(2, node13);
        ListNode head1 = new ListNode(1, node12);
        writeNodes(swapPairs(head1));
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }
}