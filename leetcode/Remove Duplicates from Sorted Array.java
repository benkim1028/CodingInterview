class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        int i = 0;
        int j = 1;
        while(true){
            if(j == nums.length){
                return i + 1;
            }
            else if(nums[i] == nums[j]){
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
    }
}
