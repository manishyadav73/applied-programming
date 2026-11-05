class Solution {
    public int longestOnes(int[] nums, int k) {
       int maxLen=0;
       int left=0;
       int kCount=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=1){
            kCount++;
        }
        while(kCount>k){
            if(nums[left]==0){
                kCount--;
            }
            left++;
        }
        maxLen=Math.max(maxLen,i-left+1);
       } 
       return maxLen;
    }
}