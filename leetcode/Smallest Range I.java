class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++){
            if(A[i] < min) min = A[i];
            if(A[i] > max) max = A[i];
        }
        if(max - min <= 2 * K) return 0;
        else return (max-K) - (min+K);
    }
}
