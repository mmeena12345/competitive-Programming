class Solution{
  public int subsetXORSum(int[] nums){
    return util(nums,0,0);
  }
  
  public int util(int[] nums,int currInd,int currXOR){
    if(currInd==nums.length){
      return currXOR;
    }
    
    int withEle = util(nums,currInd+1,currXOR^nums[currInd]);
    int withoutEle = util(nums,currInd+1,currXOR);
    
    return withEle+withoutEle;
  }
}
