class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<String>(), s, 0);
        return ans;
    }
    
    private void backtrack(List<List<String>> ans, List<String> ele, String s, int start){
        if(start == s.length()) {
            ans.add(new ArrayList<>(ele));
            return;
        }
        ArrayList<String> temp = new ArrayList<>(ele);
        for(int i = start; i < s.length(); i++){
            String sub = s.substring(start, i + 1);
            if(isPalindrome(sub)){
                temp.add(sub);
                backtrack(ans, temp, s, i + 1);
            }
            temp.remove(sub);
        }
    }
    
    private boolean isPalindrome(String s){
        if(s.equals("")) return false;
        int last = s.length() - 1;
        int first = 0;
        while(first < last){
            if(s.charAt(first) == s.charAt(last)){
                first ++;
                last --;
            } else {
                return false;
            }
        }
        return true;
    }
}
