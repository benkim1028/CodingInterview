class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode[] heads = new ListNode[lists.length];
        ListNode ans = null;
        ListNode curr = null;
        for(int i = 0; i < lists.length; i++){
            heads[i] = lists[i];
        }
        while(true){
            int index = 0;
            int smallest = Integer.MAX_VALUE;
            for(int i = 0; i < heads.length; i++){
                if(heads[i] != null && smallest >= heads[i].val){
                    smallest = heads[i].val;
                    index = i;
                } 
            }
            if(smallest == Integer.MAX_VALUE)
                break;
            if(ans == null){
                ans = heads[index];
                heads[index] = heads[index].next;
                curr = ans;
            } else {
                curr.next = heads[index];
                curr = curr.next;
                heads[index] = heads[index].next;
            }
        }
        return ans;
    }
}
