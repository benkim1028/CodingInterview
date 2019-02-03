class Solution {
    public int change(int amount, int[] coins) {
        int count = 0;
        count += calculate(amount, coins, 0);
        return count;
    }
    
    private int calculate(int amount, int[] coins, int start){
        int count = 0;
        if(amount == 0) return 1;
        if(amount <= 0) return 0;
        for(int i = start; i < coins.length; i++){
            count += calculate(amount - coins[i], coins, i);
        }
        return count;
    }
}
