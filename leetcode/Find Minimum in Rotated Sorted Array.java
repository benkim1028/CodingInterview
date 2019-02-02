class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int end = nums.length - 1;
        int start = 0;
        int mid;
        while(true){
            if(end <= start) break;
            mid = (start + end + 1) / 2;
            if(nums[0] < nums[mid]){
                start = mid;
            } else {
                if(nums[mid] < min) {
                    min = nums[mid];
                }
                end = mid - 1;
            }
        }
        if(min == Integer.MAX_VALUE)
            return nums[0];
        return min;
    }
}
