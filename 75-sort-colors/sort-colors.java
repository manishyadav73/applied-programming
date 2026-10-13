class Solution {
    private void swap(int nums[],int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int left=0;
        int mid=0;
        int right=n-1;
        while(mid<=right){
            if(nums[mid]==0){
                // int temp=nums[mid];
                // nums[mid]=nums[left];
                // nums[left]=temp;
                // left++;
                // mid++;
                swap(nums,left,mid);
                left++;
                mid++;
                
            }else if(nums[mid]==1){
                mid++;
            }else{
                // int temp=nums[mid];
                // nums[mid]=nums[right];
                // nums[right]=temp;
                swap(nums,mid,right);
                
                right--;
            }
        }
    }
}