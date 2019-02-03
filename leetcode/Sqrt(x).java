class Solution {
    public int mySqrt(int x) {
        if(x > 46340 * 46340) return 46340;
        double mid = 0;
        double high = x;
        double low = 0;
        while(true){
            mid = (high + low) / 2;
            if(x == (int) (mid * mid)) break;
            if(x < mid * mid){
                high = mid;
            } else {
                low = mid;
            }
        }
        return (int) mid;
    }
}
