class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
        int index=target-nums[i];
        if(map.containsKey(index)){
           return new int[]{ map.get(index),i};
            
        }
        map.put(nums[i],i);
       }
       return new int[]{};
    }
}