class Solution{
 public int minNoOfCoins(int N,int coins[]){
   int len = coins.length;
   int dp[][]=new int[len+1][N+1];
   for(int i=0;i<=len;i++){
    for(int j=0;j<=N;j++){
        if(i==0){
          dp[i][j]=Integer.MAX_VALUE-1;
        }else if(j==0){
          dp[i][j]=0;
        }
    }
   }
   
   for(int i=1;i<=N;i++){
      if(i%coins[0]==0){
        dp[1][i]=i/coins[0];
      }else{
        dp[1][i]=Integer.MAX_VALUE-1;
      }
   }
   
   for(int i=2;i<=len;i++){
    for(int j=1;j<=N;j++){
       if(coins[i-1]<=j){
        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-coins[i-1]]);
       }else{
        dp[i][j]=dp[i-1][j];
       }
    }
   }
   
   if(dp[len][N]==Integer.MAX_VALUE-1){
      return -1;
   }else{
      return dp[len][N];
   }
 }
}
