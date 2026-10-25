class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
      int sum=0;
      int left=0;
      int max=0;
    
     for(int i=0;i<s.length();i++){
        sum+=(int)Math.abs(s.charAt(i)-t.charAt(i));
        
        while(sum>maxCost){
            sum-=Math.abs(s.charAt(left)-t.charAt(left));
              left++;
        }
      
         int len = i-left+1;
     max = Math.max(len,max);
     }
    return max;
    }
}