class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        List<Character> temp;
        int answer = 0;
        for (int i = 0 ; i < length ; i ++){
            temp  = new ArrayList<Character>();
            temp.add(chars[i]);
            for (int j = i + 1 ; j < length ; j ++){
                if(temp.contains(chars[j])) break;
                else temp.add(chars[j]);
            }
            if(temp.size() > answer) answer = temp.size();
        }
        return answer;
    }
}
