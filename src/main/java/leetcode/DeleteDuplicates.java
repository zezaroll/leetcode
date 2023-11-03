package leetcode;

import static leetcode.ReverseLinkedList.writeNodes;

public class DeleteDuplicates {

    public static void main(String[] args) {
//        ListNode node3 = new ListNode(4);
//        ListNode node2 = new ListNode(2, node3);
//        ListNode head = new ListNode(17, node2);

        ListNode node15 = new ListNode(-1);
        ListNode node14 = new ListNode(-1, node15);
        ListNode node13 = new ListNode(-1, node14);
        ListNode node12 = new ListNode(-1, node13);
        ListNode head1 = new ListNode(-1, node12);

        ListNode listNode = deleteDuplicates(head1);
        writeNodes(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        while (current.next != null) {
            ListNode next = current.next;
            if (current.val == next.val) {
                current.next = next.next;
            } else {
                current = next;
            }
        }
        return head;
    }
}
