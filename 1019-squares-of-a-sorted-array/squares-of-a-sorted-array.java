class Solution {
    public int[] sortedSquares(int[] nums) {
         int n=nums.length;
         int result[]=new int[n];
         int first=0;
         int last=n-1;
         int pos=n-1;
         while(first<=last){
            int firstsq=nums[first]*nums[first];
            int lastsq=nums[last]*nums[last];
            if(firstsq>lastsq){
                result[pos]=firstsq;
                first++;
            }else{
                result[pos]=lastsq;
                last--;
            }
            pos--;
         }
         return result;
    }
}