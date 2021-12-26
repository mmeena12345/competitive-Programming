class Solution{
  
  public void subsetRec(int i,int[] num,int n,List<List<Integer>>res,List<Integer>lis){
    if(i==n){
     return;
    }
    
    for(int j=i;j<n;j++){
      lis.add(num[j]);
      res.add(new ArrayList(lis));
      subsetRec(j+1,num,n,res,lis);
      lis.removed(lis.size()-1);
    }
  }
  
  public List<List<Integer>> subsets(int[] num){
    List<List<Integer>>res=new ArrayList<>();
    List<Integer>lis=new ArrayList<>();
    int n=nums.length;
    subsetsRec(0,num,n,res,lis);
    return res;
  }
}
