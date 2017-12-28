class PassingCars {
    public int solution(int[] A) {
        int answer = 0;
        int numberOfOne = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 1)
                numberOfOne++;
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                answer += numberOfOne;
                if(answer > 1000000000)
                    return -1;
            }
            if(A[i] == 1)
                numberOfOne--;
        }
        return answer;
    }
}
