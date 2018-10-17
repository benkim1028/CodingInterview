class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        int index = 0;
        while(index < nums.length){
            if(nums[index] == 0) {
                zeros++;        
                index++;
            }
            else {
                nums[index - zeros] = nums[index];
                index++;
            }
        }
        while(zeros != 0){
            nums[--index] = 0;
            zeros--;
        }
    }
}
