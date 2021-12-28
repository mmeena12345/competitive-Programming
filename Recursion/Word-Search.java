class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordArr = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(exist(i,j,0,wordArr,board)) return true;
            }
        }
        return false;
    }
    
    public boolean exist(int x,int y,int i,char[] wordArr,char[][] board){
        if(i==wordArr.length) return true;
        if(x<0 || y<0 || x==board.length || y==board[0].length) return false;
        if(wordArr[i]!=board[x][y]) return false;
        
        char ch =  board[x][y];
        board[x][y]='*';
        
        boolean isExist = exist(x+1,y,i+1,wordArr,board)||
                          exist(x,y+1,i+1,wordArr,board)||
                          exist(x-1,y,i+1,wordArr,board)||
                          exist(x,y-1,i+1,wordArr,board);
        
        board[x][y]=ch;
        return isExist;
    }
}
