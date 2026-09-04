class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=0;
        int maxIndx=0;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
                maxIndx=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i==maxIndx)continue;
            else if(nums[maxIndx]<nums[i]*2)
            return -1;
        }
        return maxIndx;
    }
}