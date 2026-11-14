class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        helper(nums,0,new ArrayList<>(),result);
        return result;
    }
    private void helper(int num[],int index,List<Integer>current,List<List<Integer>>result){
      if(index==num.length){
       result.add(new ArrayList<Integer>(current));
        return ;
      }
      current.add(num[index]);
      helper(num,index+1,current,result);
      current.remove(current.size()-1);
      helper(num,index+1,current,result);
    }
}