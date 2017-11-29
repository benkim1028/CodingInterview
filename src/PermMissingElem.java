public class PermMissingElem {
    class Solution {
        public int solution(int[] A) {
            int largest = A.length + 1;
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i];
            }
            int result = largest * (largest + 1) / 2 - sum;
            return result;
        }
    }
}
