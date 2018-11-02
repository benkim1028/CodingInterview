class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length - 1;
        int n = obstacleGrid[0].length - 1;
        boolean firstRowHasBlock = false;
        boolean firstColumnHasBlock = false;
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                    firstRowHasBlock = i == 0? true: firstRowHasBlock;
                    firstColumnHasBlock = j == 0? true: firstColumnHasBlock;
                }
                else if(i == 0) 
                    obstacleGrid[i][j] = firstRowHasBlock? 0 : 1;
                else if(j == 0){
                    obstacleGrid[i][j] = firstColumnHasBlock? 0 : 1;
                }
                else obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
            }
        }
        return obstacleGrid[m][n];
    }
}
