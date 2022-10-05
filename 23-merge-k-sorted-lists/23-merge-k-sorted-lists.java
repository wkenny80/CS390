/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        // priority queue
        for(ListNode node : lists)
        {
            while(node != null)
            {
                queue.add(node.val);
                node = node.next;
            }
        }
        
        ListNode res = new ListNode();
        if (queue.size() == 0) { // check
            return null;
        } else {
            res.val = queue.poll();
            ListNode temp = res;
            while (queue.size() != 0) {
                temp.next = new ListNode(queue.poll());
                temp = temp.next;
            }
            return res;
        } 
    }
}