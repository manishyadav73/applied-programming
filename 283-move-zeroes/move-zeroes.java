class Solution {
    public void moveZeroes(int[] nums) {
       int j=0;
       for(int n:nums){
        if(n!=0){
           nums[j]=n; 
           j++;
        }
       }
       while(j<nums.length){
        nums[j]=0;
        j++;
       }
    }
}