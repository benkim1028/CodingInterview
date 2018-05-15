class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> basecase = new ArrayList<Integer>();
        basecase.add(1);
        ans.add(basecase);
        List<Integer> temp = basecase;
        for(int i = 1; i < numRows; i++){
            List<Integer> temp2 = helper(temp);
            temp = temp2;
            ans.add(temp2);
        }
        return ans;
        
    }
    
    private List<Integer> helper (List<Integer> numsArray){
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < numsArray.size() + 1; i++){
            if(i == 0 || i == numsArray.size())
                ans.add(1);
            else {
                ans.add(numsArray.get(i) + numsArray.get(i - 1));
            }   
        }    
        return ans;
    }
}
