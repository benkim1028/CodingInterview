/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode point1 = head;
        ListNode point2 = head;
        ListNode prev = start;
        while(point2 != null){
            if(n > 0){
                point2 = point2.next;
                n--;
            } else{
                prev = point1;
                point1 = point1.next;
                point2 = point2.next;
            }
        }
        prev.next = point1.next;
        return start.next;
    }
}
