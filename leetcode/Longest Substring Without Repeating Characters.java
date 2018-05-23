class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        Map<Character, Boolean> temp;
        int answer = 0;
        for (int i = 0 ; i < length ; i ++){
            temp  = new HashMap<Character, Boolean>();
            temp.put(chars[i], true);
            for (int j = i + 1 ; j < length ; j ++){
                if(temp.get(chars[j]) != null) break;
                else temp.put(chars[j], true);
            }
            if(temp.size() > answer) answer = temp.size();
        }
        return answer;
    }
}
