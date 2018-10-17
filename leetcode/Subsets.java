class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        helper(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    
    private void helper(List<List<Integer>> ans, List<Integer> arr, int[] nums, int index){
        if(index == nums.length) return;
        for(int i = index; i < nums.length; i++){
            arr.add(nums[i]);
            ans.add(new ArrayList<>(arr));
            helper(ans, arr, nums, i + 1);
            arr.remove(new Integer(nums[i]));
        }
    }
}
