class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findAllCombinations(ans, new ArrayList<Integer>(), candidates, target, 0, 0);
        return ans;
    }
    
    private void findAllCombinations(List<List<Integer>> ans, List<Integer> com, int[] candidates, int target, int sum, int index){
        if(sum > target) return;
        if(sum == target) {
            ans.add(new ArrayList<Integer>(com));
            return;    
        };
        for(int i = index; i < candidates.length; i++){
            com.add(candidates[i]);
            findAllCombinations(ans, com, candidates, target, sum + candidates[i], i);
            com.remove(com.size() -1 ); 
        }
    }
}
