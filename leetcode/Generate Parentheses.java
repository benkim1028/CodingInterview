class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateAndSave(ans, "", n, n);
        return ans;
    }
    private void generateAndSave(List<String> ans, String str, int open, int close){
        if(open == 0 && close == 0){
            ans.add(str);
            return;
        }
        if(open != 0){
            generateAndSave(ans, str + "(", open - 1, close);
        }
        if(close > open && close != 0){
            generateAndSave(ans, str + ")", open, close - 1);
        }
    }
}
