class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helperfunction(ans, new ArrayList<Integer>(), candidates, target, 0, 0);
        return ans;
    }
    
    private void helperfunction(List<List<Integer>> ans, List<Integer> ele, int[] candidates, int target, int sum, int index){
        if(sum > target) return;
        
        List<Integer> copy = new ArrayList<>(ele);
        
        if(sum == target) {
            ans.add(copy);
            return;
        }
        
        else {
            int prev = -1;
            for(int i = index; i < candidates.length; i++){
                if(candidates[i] != prev){
                    copy.add(candidates[i]);
                    helperfunction(ans, copy, candidates, target, sum + candidates[i], i + 1);
                    copy.remove(new Integer(candidates[i]));
                    prev = candidates[i];
                }
            }
        }
    }
}
