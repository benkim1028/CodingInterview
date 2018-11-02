class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        for (int i = 2; i <= n; i++){
            if(i % 2 == 0) first = first + second;
            else second = first + second;
        }
        return n % 2 == 0? first : second;
    }
}
