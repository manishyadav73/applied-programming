class Solution {
    public int maxArea(int[] height) {
int maxarea =0,left=0,right=height.length-1;
while(left<right){
    int area=Math.min(height[left],height[right])*(right-left);
    maxarea=Math.max(maxarea,area);
    if(height[left]<height[right]){
        left ++;
    }else{ 
        right--;
    }

}
    return maxarea;
    }
}