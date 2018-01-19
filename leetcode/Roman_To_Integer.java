class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && romanToIntHelper(s.charAt(i)) < romanToIntHelper(s.charAt(i + 1))){
                answer-=romanToIntHelper(s.charAt(i));
            } else {
                answer+=romanToIntHelper(s.charAt(i));
            }
        }
        return answer;
    }
    private int romanToIntHelper(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5; 
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
                
        }
        return 0;
    }
}
