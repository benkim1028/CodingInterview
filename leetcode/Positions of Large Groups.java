class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        if(S.length() < 2) return ans;
        ArrayList<Integer> ele = new ArrayList<Integer>();
        int curr = S.charAt(0);
        int count = 1;
        for(int i = 1; i < S.length(); i ++){
            if (curr == S.charAt(i)){
                count++;
            } else if (curr != S.charAt(i)){
                if(count >= 3){
                    ele = new ArrayList<Integer>();
                    ele.add(0, i - count);
                    ele.add(1, i - 1);
                    ans.add(ele);
                }
                count = 1;
                curr = S.charAt(i);
            } 
        }
        if(count >= 3){
            ele = new ArrayList<Integer>();
            ele.add(0, S.length() - count);
            ele.add(1, S.length() - 1);
            ans.add(ele);
        }
        return ans;
    }
}
