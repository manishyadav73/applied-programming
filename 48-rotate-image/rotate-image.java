class Solution {
    public void rotate(int[][] matrix) {
      int n=matrix.length;
      int result[][]=new int[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
         result[j][(n-1)-i]=matrix[i][j];
        }
       
     }
     // 2. THE FIX: Copy everything back into the original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }
}