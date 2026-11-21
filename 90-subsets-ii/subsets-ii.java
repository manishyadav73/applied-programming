class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,list,ans);
        return ans;
    }
    private static void subset(int index,int nums[],List<Integer>list,List<List<Integer>>ans){
        
      
            ans.add(new ArrayList<>(list));
           
       for(int i=index;i<nums.length;i++){
  if (i > index && nums[i] == nums[i - 1])
                continue;
       
        list.add(nums[i]);
        subset(i+1,nums,list,ans);
        list.remove(list.size()-1);
      
       }
    }
}