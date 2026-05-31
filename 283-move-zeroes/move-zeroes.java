import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
       int n=nums.length;
      
       int pos=0;
    //    int j=0;
    //    for(int i=0;i<n;i++){
    //          if(nums[i]!=0){
    //             int temp=nums[i];
    //             nums[i]=nums[j];
    //             nums[j]=temp;
    //             j++;
                
    //          }
    //    } 
    for(int i=0;i<n;i++){
        if(nums[i]!=0){
            nums[pos]=nums[i];
            pos++;
        }
    }
    while(pos<n){
        nums[pos]=0;
        pos++;
    }
System.out.println(Arrays.toString(nums));
    }
}