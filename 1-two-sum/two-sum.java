class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int nums1=target-nums[i];
           
            if(hm.containsKey(nums1)){
                  int index=hm.get(nums1);
                return new int[]{index,i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}