
class Solution {
    public static void rev(int nums[],int si,int ei){
        while(si<=ei){
            int temp=nums[si];
            nums[si]=nums[ei];
            nums[ei]=temp;
            si++;
            ei--;
        }
    }
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       if(k>n)k=k%n;
       rev(nums,0,n-1);
       rev(nums,0,k-1);
       rev(nums,k,n-1);
    }
}
