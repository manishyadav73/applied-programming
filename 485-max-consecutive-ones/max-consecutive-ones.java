class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int n=nums.length;
     int curr=0;
     int max=0;
     for(int i=0;i<n;i++){
        if(nums[i]==1){
            curr++;
        }else{
            max=Math.max(max,curr);
            curr=0;
        }
     }
     return Math.max(max,curr);
    }
}