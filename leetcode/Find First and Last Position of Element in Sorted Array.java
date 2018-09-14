class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1, -1};
        int result = binarySearch(0, nums.length - 1, nums, target);
        if(result == -1) return answer;
        else{
            answer[0] = search(nums, target, true, result);
            answer[1] = search(nums, target, false, result);
        }
        return answer;
    }
    private int binarySearch(int left, int right, int[] nums, int target){
        if(left > right) return -1;
        int mid = (right + left)/2;
        if(nums[mid] == target) return mid;
        if(nums[mid] > target) return binarySearch(left, mid - 1, nums, target);
        if(nums[mid] < target) return binarySearch(mid + 1, right, nums, target);
        return -1;
    }
    private int search(int[] nums, int target, boolean left, int start){
        if(left){
            while(nums[start] == target){
                if(start == 0) return 0;
                start--;
            }
            start++;
        } else {
            while(nums[start] == target){
                if(start == nums.length - 1) return nums.length - 1;
                start++;
            }
            start--;
        }
        return start;
    }
}
