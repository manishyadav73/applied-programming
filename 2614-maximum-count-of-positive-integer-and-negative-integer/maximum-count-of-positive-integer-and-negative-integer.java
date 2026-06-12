class Solution {
    public int maximumCount(int[] nums) {
        int no_pos=0;
        int no_neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                no_pos++;
            }else if(nums[i]<0){
                no_neg++;
            }
        }
        return Math.max(no_pos,no_neg);
    }
}