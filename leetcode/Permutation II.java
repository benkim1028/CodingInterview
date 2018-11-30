class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helperfunction(ans, new ArrayList<Integer>(), new int[nums.length], nums);
        return ans;
    }
    
    private void helperfunction(List<List<Integer>> ans, List<Integer> ele, int[] check, int[] nums){
        List<Integer> copy = new ArrayList<>(ele);
        if(ele.size() == nums.length){
            ans.add(copy);
            return;
        }
        
        else {
            int prev = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++){
                if(check[i] != 1 && prev != nums[i]){
                    prev = nums[i];
                    copy.add(nums[i]);
                    check[i] = 1;
                    helperfunction(ans, copy, check, nums);
                    copy.remove(copy.size() - 1);
                    check[i] = 0;
                }
            }
        }
    }
}
