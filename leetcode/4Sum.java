class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            for(int j = i + 1; j < nums.length - 2; j++){
                int l = j + 1;
                int r = nums.length - 1;
                while(l < r){
                    if(nums[i] + nums[j] + nums[r] + nums[l] == target){
                        List<Integer> ele = new ArrayList<>();
                        ele.add(nums[i]);
                        ele.add(nums[j]);
                        ele.add(nums[l]);
                        ele.add(nums[r]);
                        if(!ans.contains(ele)) ans.add(ele);
                        r--;
                        l++;
                    } else if(nums[i] + nums[j] + nums[r] + nums[l] < target){
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return ans;
    }
}
