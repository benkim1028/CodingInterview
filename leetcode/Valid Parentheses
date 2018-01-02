class Solution {
    public boolean Solution(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                top++;
                stack[top] = curr;
            } else if (curr == ')' || curr == '}' || curr == ']'){
                if(top == -1)
                    return false;
                if(!sameShape(stack[top], curr)){
                    return false;
                } else {
                    top--;
                }
            }
        }
        return (top == -1) ? true: false;
    }
    private boolean sameShape(char a, char b){
        switch (a){
            case '(':
                return (b == ')') ? true : false;
            case '{':
                return (b == '}') ? true : false;
            case '[':
                return (b == ']') ? true : false;
            default:
                return false;
        }
    }
}
