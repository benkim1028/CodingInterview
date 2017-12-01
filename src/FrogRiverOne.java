class FrogRiverOne  {
    public int solution(int X, int[] A) {
        int sol[] = new int[X + 1];
        int counter = 0;
        for (int i = 0; i < A.length; i++){
            if(A[i] <= X && sol[A[i]] == 0){
                sol[A[i]]++;
                counter++;
            }
            if(counter >= X){
                return i;
            }
        }
        return -1;
    }
}