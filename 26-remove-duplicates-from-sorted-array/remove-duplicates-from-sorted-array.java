class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
       int first=0;
       for(int i=1;i<n;i++){
        if(nums[first]!=nums[i]){
             first++;
            nums[first]=nums[i];  
        }
       }
      return first+1;
    }
}