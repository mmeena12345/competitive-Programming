class Solution{
  public String convert(String s,int numRows){
    int sLen = s.length();
    if(numRows==1){
      return s;
    }
    List<StringBuilder>strs = new ArrayList<>();
    int numOfRows = Math.min(sLen,numRows);
    for(int i=0;i<numOfRows;i++){
      strs.add(new StringBuilder());
    }
    
    int currRow = 0;
    boolean isDown = false;
    for(int i=0;i<sLen;i++){
      strs.get(currRow).append(s.charAt(i));
      if(currRow==0||currRow==numOfRows-1){
        isDown=!isDown;
      }
      currRow += isDown ? 1 : -1; 
    }
    
    StringBuilder res = new StringBuilder();
    for(StringBuilder str : strs){
      res.append(str);
    }
    
    return res.toString();
  }
}
