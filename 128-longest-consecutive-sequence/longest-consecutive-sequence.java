class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer>set=new HashSet<>();
      int maxCount=0;
      for(int n:nums){
        set.add(n);
      }  
      for(int m:set){
        if(set.contains(m-1))continue;
        int count=1;
        int first=m;
        while(set.contains(first+1)){
            count++;
            first++;
        }
        maxCount=Math.max(count,maxCount);
      }
      return maxCount;
    }
}