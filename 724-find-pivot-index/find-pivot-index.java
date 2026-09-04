class Solution {
    public int pivotIndex(int[] nums) {
       int n=nums.length;
       int sum=0;
       int left_sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];

       }
       for(int i=0;i<n;i++){
        sum-=nums[i];
        if(sum==left_sum)return i;
        left_sum+=nums[i];
       } 
       return -1;
    }
}