class Solution{
  public int lcs(String txt1,String txt2,int n,int m){
    if(n==0||m==0){
     return 0;
    }
    
    if(txt1.charAt(n-1)==txt2.charAT(m-1)){
      return 1+lcs(txt1,txt2,n-1,m-1);
    }else{
     return Math.max(lcs(txt1,txt2,n,m-1),lcs(txt1,txt2,n-1,m));
    }
    
  }
}
