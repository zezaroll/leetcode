package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

import static leetcode.ReverseLinkedList.writeNodes;

public class MergeTwoSortedLists {

    public class OBJ {
        int x;
        int z;

        public OBJ(int x, int z) {
            this.x = x;
            this.z = z;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getZ() {
            return z;
        }

        public void setZ(int z) {
            this.z = z;
        }
    }

    public static void main(String[] args) {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

//        ListNode node3 = new ListNode(5);
//        ListNode node2 = new ListNode(2, node3);
//        ListNode head = new ListNode(0, node2);
//
//        ListNode node13 = new ListNode(3);
//        ListNode node12 = new ListNode(2, node13);
//        ListNode head1 = new ListNode(1, node12);
//
//        ListNode listNode = mergeTwoLists(head, head1);
//        writeNodes(listNode);
    }

    public void List(){
        ArrayList<OBJ> objs = new ArrayList<>();
        objs.add(new OBJ(1,2));
        objs.add(new OBJ(2,3));

        Arrays.stream(new ArrayList[]{objs});
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode tail = merged;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
            tail.next = list1 == null ? list2 : list1;
        }
        return merged.next;
    }
}