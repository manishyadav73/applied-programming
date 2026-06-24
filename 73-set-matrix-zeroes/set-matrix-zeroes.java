class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;//rows
        int m=matrix[0].length;//column
        boolean []zerosRow=new boolean[n];
        boolean []zerosCol=new boolean[m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           if(matrix[i][j]==0){
            zerosRow[i]=true;
            zerosCol[j]=true;

           }
        }}
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(zerosRow[i]||zerosCol[j]){
                    matrix[i][j]=0;

                }
            }
        }
      
      System.out.print(Arrays.deepToString(matrix)); 
    }
}