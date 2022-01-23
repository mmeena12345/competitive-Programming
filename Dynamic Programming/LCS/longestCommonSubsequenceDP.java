class Solution{
 public int lcs(String txt1,String txt2,int n,int m){
   int dp[][] = new int[n+1][m+1];
   for(int i=0;i<=n;i++){
    for(int j=0;j<=m;j++){
      if(i==0||j==0){
        dp[i][j]=0;
      }
    }
   }
   
   for(int i=1;i<=n;i++){
    for(int j=1;j<=m;j++){
      if(txt1[i-1]==txt2[j-1]){
        dp[i][j]=1+dp[i-1][j-1];
      }else{
        dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
      }
    }
   }
   
   return dp[n][m];
 }
}
