package leetcode;

import java.util.List;

public class PalindromeLinkedList {

    public static void main(String[] args) {
//        ListNode node3 = new ListNode(4);
//        ListNode node2 = new ListNode(2, node3);
//        ListNode head = new ListNode(17, node2);

//        ListNode node15 = new ListNode(-1);
        ListNode node14 = new ListNode(0);
        ListNode node13 = new ListNode(2, node14);
        ListNode node12 = new ListNode(2, node13);
        ListNode head1 = new ListNode(1, node12);

        System.out.println(isPalindrome(head1));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode listA = head;
        ListNode listB = new ListNode(head.val);
        ListNode listB2 = listB;
        ListNode next;
        ListNode prev = null;

        while (listA != null) {
            listB2.next = new ListNode(listA.val);
            listB2 = listB2.next;
            next = listA.next;
            listA.next = prev;
            prev = listA;
            listA = next;
        }
        listB = listB.next;
        while (prev != null) {
            if (prev.val == listB.val) {
                prev = prev.next;
                listB = listB.next;
            } else return false;
        }
        return true;
    }
}