class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
     int maxSum=0;
     int left=0;
     while(left<nums.length){
        maxSum+=nums[left];
        left=left+2;
     }   
     return maxSum;
    }
}