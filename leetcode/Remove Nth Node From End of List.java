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
        ListNode point1 = head;
        ListNode point2 = head;
        while(n > 0){
            ListNode temp = point2.next;
            point2 = temp;
            n--;
        }
        while(true){
            if(point2 == null)
                return point1.next;
            if(point2.next == null){
                point1.next = point1.next.next;
                break;
            }
            point1 = point1.next;
            point2 = point2.next;
        }
        return head;
    }
}
