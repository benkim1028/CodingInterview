class Solution {
    public int climbStairs(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 0);
        arr.add(1, 1);
        arr.add(2, 2);
        for(int start = 3; start <= n; start++){
            arr.add(start, new Integer(arr.get(start-1) + arr.get(start-2)));
        }
        return arr.get(n);
}
