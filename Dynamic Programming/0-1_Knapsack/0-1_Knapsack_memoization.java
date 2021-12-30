class Solution{
  
  int N=102;
  int M=1002;
  int dp[][]=new int[102][1002];
  public int knapsack(int wt[],int val[],int W){
    int n = wt.length;
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        dp[i][j]=-1;
      }
    }
    
    return knapsackUtil(wt,val,n,W);
  }
  
  public int knapsackUtil(int wt[],int val[],int n,int W){
    if(n==0||W==0){
      return 0;
    }
    
    if(dp[n][W]!=-1){
      return dp[n][w];
    }
    
    if(wt[n-1]<=W){
      return dp[n][w]= Math.max(val[n-1]+knapsackUtil(wt,val,n-1,W-wt[n-1]),knapsackUtil(wt,val,n-1,W));
    }else{
      return dp[n][w] = knapsackUtil(wt,val,n-1,W);
    }
  }
  
}
