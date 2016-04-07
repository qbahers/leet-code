/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode headSmaller = smaller;
        ListNode headGreater = greater;

        while (head != null) {
            if (head.val < x) {
                smaller.next = head;
                smaller = smaller.next;
            }
            else {
                greater.next = head;
                greater = greater.next;
            }

            head = head.next;
        }

        greater.next = null;
        smaller.next = headGreater.next;

        return headSmaller.next;
    }

}