class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int front = 0;
        int back = nums.length - 1;
        while(front <= back){
            if(nums[front] == val){
                nums[front] = nums[back];
                back--;
            } else {
                front++;
            }
        }
        return back + 1;
    }
}
