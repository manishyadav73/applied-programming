class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
     double sum=0;
     int left=0;
    for(int i=0;i<k;i++){
        sum+=nums[i];
    } 
     double maxAvg=sum;
    for(int j=k;j<nums.length;j++){
       sum=sum-nums[j-k]+nums[j];
       maxAvg=Math.max(maxAvg,sum);
    }
    return maxAvg/k;
    }
}