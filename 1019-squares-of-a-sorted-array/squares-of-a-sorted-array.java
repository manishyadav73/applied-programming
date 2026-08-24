class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res[]=new int[n];
        int pos=n-1;
        while(low<=high){
            int sqlow=nums[low]*nums[low];
            int sqhigh=nums[high]*nums[high];
            if(sqhigh>sqlow){
            res[pos--]=sqhigh;
            high--;}
            else{
            res[pos--]=sqlow;
            low++;}
        }
        return res;
    }
}