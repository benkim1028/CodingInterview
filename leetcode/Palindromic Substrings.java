class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length() + 1; j++){
                if(isPalindrome(s.substring(i, j))) count++;
            }
        }
        return count;
    }
    
    private boolean isPalindrome(String s){
        if(s.length() == 1) return true;
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
