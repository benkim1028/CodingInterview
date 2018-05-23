class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode num1 = l1;
        ListNode num2 = l2;
        ListNode ans = new ListNode(0);
        ListNode index = ans;
        int overhead = 0;
        while(num1 != null || num2 != null){
            int sum = overhead;
            if(num1 != null) {
                sum += num1.val;
                num1 = num1.next;
            }
            if(num2 != null) {
                sum += num2.val;
                num2 = num2.next;
            }
            index.next = new ListNode (sum % 10);
            index = index.next;
            overhead = sum / 10;
        }
        if(overhead > 0){
            index.next = new ListNode (overhead);
        }
        return ans.next;
    }
}
