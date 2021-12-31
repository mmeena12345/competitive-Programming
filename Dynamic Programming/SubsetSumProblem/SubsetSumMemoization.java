class Solution{
  
  public int isSubsetSumUtil(int arr[],int sum,int n,int dp[][]){
    if(sum==0){
      return true;
    }
    if(n==0){
      return false;
    }
    
    if(dp[n][sum]!=-1){
      return dp[n][sum];
    }
    
    if(arr[n-1]>sum){
       return dp[n][sum] = isSubsetSumUtil(arr,sum,n-1,dp);
    }else{
      if(isSubsetSumUtil(arr,sum-arr[n-1],n-1)!=0 || isSubsetSumUtil(arr,sum,n-1)!=0){
        dp[n][sum]=1;
      }else{
        dp[n][sum]=0;
      }
      return dp[n][sum];
    }
    
  }
  
  public Boolean isSubsetSum(int arr[],int sum){
    int n = arr.length;
    int dp[][]=new int[n+1][sum+1];
    for(int i=0;i<=n;i++){
      for(int j=0;j<=sum;j++){
        dp[i][j]=-1;
      }
    }
    
    if(isSubsetSumUtil(arr,sum,n,dp)==1){
      return true;
    }
    return false;
  }
}
