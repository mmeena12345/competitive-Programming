class Solution{
  
  public Boolean isSubsetSumUtil(int[] arr,int sum,int n){
    if(sum==0){
      return true;
    }
    
    if(n==0){
      return false;
    }
    
    if(arr[n-1]<=sum){
      return isSubsetSumUtil(arr,sum-arr[n-1],n-1)||isSubsetSumUtil(arr,sum,n-1);
    }else{
      return isSubsetSumUtil(arr,sum,n-1);
    }
  } 
    
  
  public Boolean isSubsetSum(int[] arr,int sum){
    int n = arr.length;
    return isSubsetSumUtil(arr,sum,n);   
  }
}
