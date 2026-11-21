class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        sum(1,k,n,list,ans);
        return ans;
    }
    private static void sum(int i,int k,int n,List<Integer>list,List<List<Integer>>ans){
        if(k==0){
            if(n==0)
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j=i;j<=9;j++){
            if(j>n)break;
            list.add(j);
            sum(j+1,k-1,n-j,list,ans);
            list.remove(list.size()-1);
           
        }
    }
}