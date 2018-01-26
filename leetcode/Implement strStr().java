class Solution {
    public int strStr(String haystack, String needle) {
        int nlength = needle.length();
        int hlength = haystack.length();
        if(nlength == 0)
            return 0;
        if(hlength == 0 || nlength > hlength)
            return -1;
        for(int i = 0; i < hlength - nlength + 1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(nlength < 2)
                    return 0;
                for(int j = 1; j < nlength; j++){
                    if(haystack.charAt(i+j) != needle.charAt(j))
                        break;
                    if(j == nlength - 1)
                        return i;
                }
            }
        }
        return -1;
    }
}
