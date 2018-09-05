class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<Integer>(), nums, 0);
        return ans;
    }
    private void backtrack(ArrayList<List<Integer>> ans, ArrayList<Integer> arr, int[] nums, int index){
        if(arr.size() == 3 || ){
            if(arr.get(0) + arr.get(1) + arr.get(2) == 0){
                Collections.sort(arr);
                if(!ans.contains(arr)) {
                    ans.add(arr);
                    return;
                }
            } else return;
        }
        for(int i = index; i < nums.length; i++){
            arr.add(nums[i]);
            backtrack(ans, new ArrayList<Integer>(arr), nums, i+1);
            arr.remove(new Integer(nums[i]));
        }
    }
}
