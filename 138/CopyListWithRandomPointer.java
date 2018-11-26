/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */

public class CopyListWithRandomPointer {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        RandomListNode res = new RandomListNode(head.label);

        RandomListNode p = head;
        RandomListNode q = res;

        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

        while (p != null) {
            map.put(p, q);
            if (p.next != null) {
                q.next = new RandomListNode(p.next.label);
            }
            p = p.next;
            q = q.next;
        }

        p = head;
        q = res;

        while (p != null) {
            q.random = map.get(p.random);
            p = p.next;
            q = q.next;
        }

        return res;
    }

}
