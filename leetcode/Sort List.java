/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        Comparator<ListNode> comparator = new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2){
                return l1.val - l2.val;
            }
        };
        Queue<ListNode> priorityqueue = new PriorityQueue<>(comparator);
        ListNode point = head;
        while(point != null){
            priorityqueue.add(point);
            point = point.next;
        }
        ListNode ans = priorityqueue.poll();
        ListNode temp = ans;
        while(temp != null){
            temp.next = priorityqueue.poll();
            temp = temp.next;
        }
        return ans;
    }
}
