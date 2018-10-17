class Solution {
    public int hammingDistance(int x, int y) {
        int common = x ^ y;
        String str = Integer.toBinaryString(common);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) == '1')
               count++;
        }
        return count;
    }
}
