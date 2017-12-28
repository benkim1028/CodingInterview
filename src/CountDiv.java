class CountDiv {
    public int solution(int A, int B, int K) {
        int mod = A % K;
        if(mod > 0){
            return B/K - A/K;
        }else{
            return B/K - A/K + 1;
        }
    }
}