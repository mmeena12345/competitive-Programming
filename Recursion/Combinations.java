class Solution{
  
  public void combineRec(int n,int k,List<List<Integer>>res,List<Integer>temp,int cnt,int i){
    for(int j=i;j<=n;j++){
      temp.add(j);
      if(cnt+1==k){
        res.add(new ArrayList(temp));
      }
      combineRec(n,k,res,temp,cnt+1,j+1);
      temp.remove(temp.size()-1);
    }
  }
  
  public List<List<Integer>> combine(int n,int k){
    List<List<Integer>>res=new ArrayList<>();
    List<Integer>temp=new ArrayList<>();
    combineRec(n,k,res,temp,0,1);
    return res;
  } 
}
