/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        int count = countNodes(head);
        int mid = count/2;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(mid > 0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            mid --;
        }
        curr = (count % 2 == 0) ? curr : curr.next;
        while(curr != null){
            if(prev.val != curr.val)
                return false;
            prev = prev.next;
            curr = curr.next;
        }
        return true;
    }
    private int countNodes(ListNode head){
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }
}
