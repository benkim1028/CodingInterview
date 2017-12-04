import java.util.*;

class Solution {
    public int solution(int[] A) {
        HashMap map = new HashMap<Integer, Boolean>();
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i ++){
            if(A[i] > 0 && A[i] <= A.length){
                if(A[i] > largest)
                    largest = A[i];
                map.put(A[i] , true);
            }
        }
        if(largest == Integer.MIN_VALUE)
            return 1;
        for(int i= 1; i <= largest; i++){
            if(map.get(i) == null)
                return i;
        }
        return largest + 1;
    }
}