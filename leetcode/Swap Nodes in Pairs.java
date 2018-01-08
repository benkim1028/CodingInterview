/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ans = head.next;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr != null){
            curr.next = next.next;
            next.next = curr;
            if(prev != null)
                prev.next = next;
            prev = curr;
            curr = curr.next;
            if(curr == null)
                break;
            next = curr.next;
            if(next == null)
                break;
            
        }
        return ans;
    }
}
