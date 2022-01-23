class Solution{
  public String lcs(String txt1,String txt2,int n,int m){
    int dp[][]=new int[n+1][m+1];
    for(int i=0;i<=n;i++){
      for(int j=0;j<=m;j++){
        if(i==0||j==0){
          dp[i][j]=0;
        }
      }
    }
    
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        if(txt1.charAt(i-1)==txt2.charAt(j-1)){
          dp[i][j]=1+dp[i-1][j-1];
        }else{
          dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
    }
    
    int len = dp[n][m];
    int ind = len;
    char arr[] = new char[ind];
    
    int i=n,j=m;
    while(i>=0 && j>=0){
      if(txt1.charAt(i-1)==txt2.charAt(j-1)){
        arr[ind-1] = txt1.charAt(i-1);
        i--;
        j--;
        ind--;
      }else if(dp[i-1][j] > dp[i][j-1]){
        i--;
      }else{
        j--;
      }
    }
      
    String res="";
    for(int i=0;i<ind;i++){
      res+=arr[i];
    }
    
    return res;
  } 
}
