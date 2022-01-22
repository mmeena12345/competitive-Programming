class Solution{
  public int noOfWays(int n,int coin[]){
    int m = coin.length;
    int dp[][] = new int[n+1][m+1];
    for(int i=0;i<=n;i++){
      for(int j=0;j<=m;j++){
        if(j==0){
          dp[i][j]=1;
        }else if(i==0){
          dp[i][j]=0;
        }
      }
    }
    
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        if(j>=coin[i-1]){
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-coin[i-1]]);
        }else{
          dp[i][j] = dp[i-1][j];
        }
      }
    }
    return dp[n][m];
  }
}
