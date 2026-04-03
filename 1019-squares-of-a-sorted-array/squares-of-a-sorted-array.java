class Solution {
    public int[] sortedSquares(int[] nums) {
         int low=0;
         int result[]=new int[nums.length];
         int high=nums.length-1;
         int pos=nums.length-1;
         while(low<=high){
            int lowsq=nums[low]*nums[low];
            int highsq=nums[high]*nums[high];
            if(lowsq<highsq){
                result[pos]=highsq;
                high--;
                pos--;
            }
            else{
                result[pos]=lowsq;
                low++;
                pos--;
            }
         }
return result;
    }
}