public class TapeEquilibrium {
    public int solution(int[] A) {
        int partA = 0;
        int partB = 0;
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i ++){
            partB += A[i];
        }
        for(int p = 0; p < A.length - 1; p++){
            partA += A[p];
            partB -= A[p];
            if(answer > Math.abs(partA - partB)){
                answer = Math.abs(partA - partB);
            }
        }
        return answer;
    }
}

