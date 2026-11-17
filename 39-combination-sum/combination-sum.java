class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        ArrayList<List<Integer>>ans=new ArrayList<>();
         ArrayList<Integer>list=new ArrayList<>();
        
        helper(0,candidates,target,list,ans);
        return ans;
    }
    private void helper(int index,int arr[],int target,ArrayList<Integer>list,ArrayList<List<Integer>>ans){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return ;
        }
        if(arr[index]<=target){
            list.add(arr[index]);

            helper(index,arr,target-arr[index],list,ans);
            list.remove(list.size()-1);

            
        }
        helper(index+1,arr,target,list,ans);
    }
}