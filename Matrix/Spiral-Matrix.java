class Solution{
  public List<Integer> spiralOrder(int[][] matrix) {
        int rowSt=0,rowEnd=matrix.length-1;
        int colSt=0,colEnd=matrix[0].length-1;
        
        List<Integer>lis=new ArrayList<>();
        int dir=0;
        while(rowSt<=rowEnd && colSt<=colEnd){
            switch(dir){
                case 0:
                    for(int col=colSt;col<=colEnd;col++){
                        lis.add(matrix[rowSt][col]);
                    }
                    rowSt++;
                    break;
                case 1:
                    for(int row=rowSt;row<=rowEnd;row++){
                        lis.add(matrix[row][colEnd]);
                    }
                    colEnd--;
                    break;
                case 2:
                    for(int col=colEnd;col>=colSt;col--){
                        lis.add(matrix[rowEnd][col]);
                    }
                    rowEnd--;
                    break;
                case 3:
                    for(int row=rowEnd;row>=rowSt;row--){
                        lis.add(matrix[row][colSt]);
                    }
                    colSt++;
                    break;
            }
            dir = (dir+1)%4;
        }
        return lis;
    }
}
