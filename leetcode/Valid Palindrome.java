class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end){
            if(!Character.isLetterOrDigit(str.charAt(end))){
                end--;
            } 
            else if(!Character.isLetterOrDigit(str.charAt(start))){
                start++;
            }
            else if(str.charAt(start) ==  str.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
