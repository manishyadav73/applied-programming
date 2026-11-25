class Solution {
    public boolean exist(char[][] board, String word) {
     int n=board.length;
     int m=board[0].length;
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           if(found(i,j,0,board,word)){
            return true;
           }
        }
     }   
return false;
}
private boolean found(int row,int col,int index,char board[][],String word){
    if(index==word.length()){
        return true;
    }
    //boundary check
    if(row<0||col<0||row>=board.length||col>=board[0].length){
        return false;
    }
    if(board[row][col]!=word.charAt(index)){
        return false;
    }
    char original=board[row][col];
    board[row][col]='#';
    boolean foundWord=found(row-1,col,index+1,board,word)
                     ||found(row+1,col,index+1,board,word)
                     ||found(row,col-1,index+1,board,word)||
                     found(row,col+1,index+1,board,word);
    board[row][col]=original;
    return foundWord;
}
}