class Solution {
    public boolean canPartition(int[] nums) {
      int len = nums.length;
      int sum=0;
      for(int i=0;i<len;i++){
        sum+=nums[i];
      }
      
      if(sum%2!=0){
        return false;
      }
      int targetSum = sum/2;
      boolean dp[][]=new int[len+1][targetSum+1];
      
      for(int i=0;i<=len;i++){
        dp[i][0]=true;
      }
      
      for(int j=1;j<=targetSum;j++){
        dp[0][j]=false;
      }
      
      for(int i=1;i<=len;i++){
        for(int j=1;j<=targetSum;j++){
          if(nums[i-1]<=j){
            dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
          }else{
            dp[i][j]=dp[i-1][j];
          }
        }
      }
      
      return dp[len][targetSum];
    }
}
