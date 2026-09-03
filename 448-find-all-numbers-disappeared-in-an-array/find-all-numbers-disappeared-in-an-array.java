class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer>set=new HashSet<>();
       for(int n:nums){
        set.add(n);
       } 
       int n=nums.length;
       List<Integer>list=new ArrayList<>();
       for(int i=1;i<=n;i++){
        if(!set.contains(i)){
            list.add(i);
        }
       }
       return list;
    }
}