class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        power(0,candidates,target,list,ans);
        return ans;
    }
  public static void power(int index,int nums[],int target,List<Integer>list,List<List<Integer>>ans){
    if(target==0){
       
        ans.add(new ArrayList<>(list));
      
        return;
    }
    if(index==nums.length||target<0)return;

    list.add(nums[index]);
    power(index+1,nums,target-nums[index],list,ans);
    list.remove(list.size()-1);
    int nextIndex=index+1;
    while(nextIndex<nums.length&&nums[nextIndex]==nums[index]){
        nextIndex++;
    }
    power(nextIndex,nums,target,list,ans);
  }
}