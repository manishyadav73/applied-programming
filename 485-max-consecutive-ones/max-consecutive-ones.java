class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int n=nums.length;
      int ones=1;
      int currOnes=0;
      int maxOnes=0;
      for(int i=0;i<n;i++){
        if(ones==nums[i]){
            currOnes++;
            maxOnes=Math.max(maxOnes,currOnes);
        }else{
        currOnes=0;}
      }
      return maxOnes;
    }
}