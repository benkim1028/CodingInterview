class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ele = new ArrayList<>();
        helper(ans, nums, ele);
        return ans;
        
    }
    
    public void helper(List<List<Integer>> ans, int[] nums, List<Integer> ele){
        if(ele.size() == nums.length) ans.add(ele);
        for(int i = 0 ; i < nums.length; i ++){
            if(!ele.contains(nums[i])){
                ele.add(nums[i]);
                helper(ans, nums, new ArrayList<Integer>(ele));
                ele.remove(new Integer(nums[i]));
            }
        }
    }
}
