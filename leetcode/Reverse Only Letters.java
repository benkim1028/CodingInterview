class Solution {
    public String reverseOnlyLetters(String S) {
        char[] charArr = S.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        while(start < end){
            if(Character.isLetter(charArr[start])){
                if(Character.isLetter(charArr[end])){
                    char temp = charArr[start];
                    charArr[start] = charArr[end];
                    charArr[end] = temp;
                    start++;
                    end--;
                } else {
                    end --;
                }
            } else {
                start++;
            }
        }
        return new String(charArr);
    }
}
