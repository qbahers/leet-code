public class RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        ListNode prev = null;
        
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                if (p == head) {
                    return deleteDuplicates(helper(p.val, p));
                }
                else {
                    prev.next = helper(p.val, p);
                    p = prev.next;
                }
            }
            else {
                prev = p;
                p = p.next;
            }
        }
        
        return head;
    }

    private ListNode helper(int value, ListNode head) {
        while (head != null && head.val == value) {
            head = head.next;
        }

        return head;
    }

}