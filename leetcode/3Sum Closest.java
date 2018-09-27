class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int ans = 0;
        int track = Integer.MAX_VALUE;
        for(int i1 = 0; i1 < length - 2; i1++){
            for(int i2 = i1 + 1; i2 < length - 1; i2++){
                for(int i3 = i2 + 1; i3 < length; i3++){
                    int sum = nums[i1] + nums[i2] + nums[i3];
                    if(Math.abs(sum - target) < track){
                        track = Math.abs(sum - target);
                        ans = sum;
                    }
                }
            }
        }
        return ans;
    }
}
