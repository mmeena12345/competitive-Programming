class Solution{
  public int knapsack(int val[],int weight[],int W){
    int n = val.length;
    return knapSackUtil(val,weight,W,n);
  }
  
  public int knapSackUtil(int val[],int weight[],int W,int n){
    if(n==0||W==0){
      return 0; 
    }
    
    if(weight[n-1]<=W){
      return Math.max(val[n-1]+knapSackUtil(val,weight,W-weight[n-1],n-1), knapSackUtil(val,weight,W,n-1));
    }else{
      return knapSackUtil(val,weight,W,n-1);
    }
  }
}
