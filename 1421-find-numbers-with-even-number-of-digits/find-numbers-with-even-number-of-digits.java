class Solution {
    static boolean isEvennumberDigit(int nums){
        int count=0;
        while(nums!=0){
            nums=nums/10;
            count++;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
       int count=0;
    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]>=10&&nums[i]<100||nums[i]>999&&nums[i]<10000||nums[i]==100000){
    //         count++;
    //     }
    //    } 
    for(int i=0;i<nums.length;i++){
        if(isEvennumberDigit(nums[i])){
            count++;
        }
    }
       return count;
    }
}