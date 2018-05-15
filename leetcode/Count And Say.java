class Solution {
    public String countAndSay(int n) {
        if(n == 0){
            return "";
        }
        String ans = "";
        for(int i = 0; i < n; i++){
            ans = countAndSayHelper(ans);
        }
        return ans;

    }
    private String countAndSayHelper(String str){
        if(str == "")
            return "1";
        int count = 1;
        char currChar = str.charAt(0);
        String ans = "";
        for(int i = 1; i < str.length(); i++){
            if(currChar == str.charAt(i)){
                count++;
            } else {
                ans += (String.valueOf(count) + currChar);
                currChar = str.charAt(i);
                count = 1;
            }
        }
        ans += (String.valueOf(count) + currChar);
        currChar = str.charAt(str.length() - 1);
        return ans;
    }
}
