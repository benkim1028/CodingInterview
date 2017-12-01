public class PermCheck  {
    public int solution(int[] A) {
        int sol[] = new int[A.length + 1];
        int largest = 0;
        for(int k = 0; k < sol.length; k++){
            sol[k] = -1;
        }
        for(int i = 0; i < A.length; i++){
            if(largest < A[i])
                largest = A[i];
            if(largest > A.length)
                return 0;
        }
        for(int j = 0; j < A.length; j++){
            sol[A[j]]++;
            if(sol[A[j]] > 0)
                return 0;
        }
        for(int z = 1; z < sol.length; z++){
            if(sol[z] == -1)
                return 0;
        }
        return 1;
    }
}