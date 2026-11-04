class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE;
        int sum=0;
          int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                sum-=nums[left];
                
                minLen=Math.min(minLen,i-left+1);
                left++;
            }
           
        }if(minLen==Integer.MAX_VALUE){
            return 0;
        }else
      
       return minLen;
       
    }
}