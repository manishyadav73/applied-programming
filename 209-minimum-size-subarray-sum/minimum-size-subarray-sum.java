class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        
        int sum=0;
       int left=0;
       int minlen=Integer.MAX_VALUE;
       int i=0;
       int nsum=0;
       for(int j=0;j<n;j++){
        nsum+=nums[j];
       }
       if(nsum<target)return 0;
       while(left<n){
        sum+=nums[left];
        while(sum>=target){
         minlen=Math.min(minlen,left-i+1);
            sum=sum-nums[i];
            i++;
        }
         left++;
        }
    
       
       
        return minlen;
    }
}